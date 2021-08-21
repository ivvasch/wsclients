package ru.inversion;

import ru.inversion.service.TestService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class App extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> res = new HashSet<>();
        res.add(TestService.class);
        return res;
    }

//    @Override
//    public Set<Object> getSingletons() {
//        Set<Class<?>> providers = new HashSet<>();
//        return (Set)Collections.unmodifiableSet(providers);
//    }
}
