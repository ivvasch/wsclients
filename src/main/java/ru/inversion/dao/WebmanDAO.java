package ru.inversion.dao;

import ru.inversion.model.Webman;

import java.util.*;

public class WebmanDAO {
    private static final Map<Integer, Webman> webmanMap = new HashMap<>();

    static{
    initMap();
    }


    private static void initMap() {
        Webman wm1 = new Webman(1,"Webman1", "LastWebman1", 12);
        Webman wm2 = new Webman(2,"Webman2", "LastWebman2", 13);
        Webman wm3 = new Webman(3,"Webman3", "LastWebman3", 14);
        Webman wm4 = new Webman(4,"Webman4", "LastWebman4", 15);
        Webman wm5 = new Webman(5,"Webman5", "LastWebman5", 16);

        webmanMap.put(wm1.getId(), wm1);
        webmanMap.put(wm2.getId(), wm2);
        webmanMap.put(wm3.getId(), wm3);
        webmanMap.put(wm4.getId(), wm4);
        webmanMap.put(wm5.getId(), wm5);
    }

    public static Webman getWebman(Integer id) {
        Webman webman = webmanMap.get(id);
        return webman;
    }

    public static Webman addWebman(Webman wm) {
        return webmanMap.put(wm.getId(), wm);
    }

    public static Webman upWebman(Webman wm) {
        webmanMap.put(wm.getId(), wm);
        return wm;
    }

    public static void delWebman(Webman wm) {
        webmanMap.remove(wm.getId());
    }

    public static List<Webman> getAll() {
        Collection<Webman> collection = webmanMap.values();
        //        System.out.println(list);
        return new ArrayList<>(collection);
    }

    List<Webman> list;
}
