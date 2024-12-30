package com.telefonica.futr.srv.nuc.testlocal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.futr.srv.nuc.testlocal.service.getworkstate.GetWorkStateCommand;

@Component
public class TestLocalCommands {

    @Autowired
    private GetWorkStateCommand getWorkStateCommand;

    public GetWorkStateCommand getWorkState() {
        return getWorkStateCommand;
    }

}