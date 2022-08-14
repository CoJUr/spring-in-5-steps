package com.mins.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCDIDAO() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
        this.someCdiDao = someCdiDao;
    }
}
