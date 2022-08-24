package com.mins.spring.basics.componentscan;


import com.mins.spring.basics.springin5steps.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

//    need to configure a proxy in JdbcConnection if we want new instance every time
//    @Autowired
//    ComponentJdbcConnection jdbcConnection;

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

/*   jdbcConnection is a prototype bean, so use proxy on it to get a new instance every time
    had PersonDAO been made a prototype (to create an instance every time),
    then we would not need proxy but number of objects wouldn't be kept low */

//    public ComponentJdbcConnection getJdbcConnection() {
//        return jdbcConnection;
//    }

    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}

