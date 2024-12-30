package com.telefonica.futr.srv.nuc.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.futr.srv.nuc.test.service.listworksbystate.ListWorksByStateCommand;

@Component
public class TestCommands {

    @Autowired
    private ListWorksByStateCommand listWorksByStateCommand;
    
    public ListWorksByStateCommand listWorksByState() {
        return listWorksByStateCommand;
    }
}