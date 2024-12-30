package com.telefonica.futr.srv.nuc.testlocal.service.getworkstate;

import com.telefonica.coco.core.domain.Command;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_IN;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Command
public class GetWorkStateCommand {

    public GetWorkState_OUT execute(GetWorkState_IN in) throws TE_Excepcion {
        
    	return null;
    	
    }
}
