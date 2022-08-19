//package com.mins.spring.basics.componentscan;
//
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
//        proxyMode = ScopedProxyMode.TARGET_CLASS) //now when JdbcConnection is created, a new instance of JdbcConnection is created every time
//public class ComponentJdbcConnection {
//
////    take home: when trying to get a bean which has a prototype dependency, use a proxy on the dependency
//    public ComponentJdbcConnection() {
//        System.out.println("Jdbc Connection constructed!");
//    }
//}
