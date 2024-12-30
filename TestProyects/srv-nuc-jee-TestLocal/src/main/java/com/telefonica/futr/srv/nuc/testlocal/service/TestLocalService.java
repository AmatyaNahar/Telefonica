package com.telefonica.futr.srv.nuc.testlocal.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_IN;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Validated
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TE_Excepcion.class)
@Service
public class TestLocalService {

    @Autowired
    private TestLocalCommands commands;

    public GetWorkState_OUT getWorkState(@NotNull @Valid GetWorkState_IN in) throws TE_Excepcion {
        return commands.getWorkState().execute(in);
    }
}
