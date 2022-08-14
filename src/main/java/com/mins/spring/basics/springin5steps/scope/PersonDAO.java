package com.mins.spring.basics.springin5steps.scope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

//    need to configure a proxy in JdbcConnection if we want new instance every time
    @Autowired
    JdbcConnection jdbcConnection;
/*   jdbcConnection is a prototype bean, so use proxy on it to get a new instance every time
    had PersonDAO been made a prototype (to create an instance every time),
    then we would not need proxy but number of objects wouldn't be kept low */

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
