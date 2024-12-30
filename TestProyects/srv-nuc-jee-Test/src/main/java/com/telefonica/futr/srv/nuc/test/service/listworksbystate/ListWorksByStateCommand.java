package com.telefonica.futr.srv.nuc.test.service.listworksbystate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.coco.core.domain.Command;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Command
public class ListWorksByStateCommand {

    private static final Logger logger = LoggerFactory.getLogger(ListWorksByStateCommand.class);

    @Autowired
    private ListWorksByStateMapper mapper;

    // TODO Autowire your dependencies here

    public ListWorksByState_OUT execute(ListWorksByState_IN in) throws TE_Excepcion {

        // TODO Develop your code here
        logger.info("Not implemented yet");
        return null;
    }
}
