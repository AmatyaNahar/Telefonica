package com.telefonica.futr.srv.nuc.test.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Validated
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TE_Excepcion.class)
@Service
public class TestService {

    @Autowired
    private TestCommands commands;

    public ListWorksByState_OUT listWorksByState(@NotNull @Valid ListWorksByState_IN in) throws TE_Excepcion {
        return commands.listWorksByState().execute(in);
    }

}
