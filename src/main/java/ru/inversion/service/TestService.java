package ru.inversion.service;

import org.codehaus.jackson.map.ObjectMapper;
import ru.inversion.dao.WebmanDAO;
import ru.inversion.gateclasses.classes.Result;
import ru.inversion.gateclasses.utils.DBWorker;
import ru.inversion.gateclasses.utils.ObjStringConverter;
import ru.inversion.gateclasses.utils.Prot;
import ru.inversion.gateclasses.utils.XxiConnector;
import ru.inversion.model.InData;
import ru.inversion.model.OutData;
import ru.inversion.model.Webman;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Path("/testws")
public class TestService {
    final static String SERVICE_NAME = "WSCLIENTS";

    @GET
    @Path("/get2")
    @Produces(MediaType.APPLICATION_JSON)
    public String getString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Webman> list = WebmanDAO.getAll();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
    }
    @POST
    @Path("/clients")
    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
    public OutData outData(InData inData) throws Throwable {
        OutData result = null;
        Connection conn = null;

        int count_attemps = 0;
        // "cmd=771944026" - заменить на необходимую ФПЗ
        String inParams = "cmd=771944026" + (char) Integer.parseInt("01", 16) + ObjStringConverter.objToString(inData);
        System.out.println();
        while(true) {
            XxiConnector connector = new XxiConnector();
            conn = connector.logon(inData.getXXIUserId(), inData.getXXIPass());

            if(count_attemps > 3) {
                if(result == null) {
                    result = new OutData();
                    result.setErr("Error run service");
                    conn.rollback();
                }

                break;
            }

            try {
                Result res = DBWorker.procCall(0, inParams, conn);

                if(res != null) {
                    String err = res.getErr();
                    if(err != null && (err.contains("ORA-6508") || err.contains("ORA-4068") || err.contains("ORA-4061") || err.contains("ORA-4065"))) {
                        throw new SQLException(null, null, 6508, new Throwable());
                    } else {
                        err = null;
                    }

                    if(err == null) {
                        result = (OutData) ObjStringConverter.fillObjFromStr(OutData.class, res.getOutParams());
                        System.out.println(res.getOutParams());
                        conn.commit();
                    } else {
                        result = new OutData();
                        result.setErr(res.getErr());
                        result.setRetCode(res.getRetCode());
                        conn.rollback();
                    }

                    break;
                } else
                    return null;
            } catch(Throwable th) {
                count_attemps++;
                th.printStackTrace();

                if(th instanceof SQLException) {
                    SQLException sqle = (SQLException) th;
                    if(sqle.getErrorCode() == 4068 || sqle.getErrorCode() == 4061 || sqle.getErrorCode() == 6508 || sqle.getErrorCode() == 4065) {
                        DBWorker.getPool().close();
                    }
                }

                Prot.writeProtocol("Error run service", th, SERVICE_NAME);
            } finally {
                if(conn != null)
                    conn.close();
            }
        }
        return result;
    }




    @GET
    @Path("/xml")
    @Consumes(MediaType.APPLICATION_XML)
    public List<Webman> getString2() {
        List<Webman> list = WebmanDAO.getAll();
        System.out.println(list);
        return list;
    }
}
