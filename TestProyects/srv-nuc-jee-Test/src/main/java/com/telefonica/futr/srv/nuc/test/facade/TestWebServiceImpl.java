package com.telefonica.futr.srv.nuc.test.facade;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.coco.web.domain.MetadataDefaults;
import com.telefonica.coco.ws.domain.exceptions.SoapTelcoException;

import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;
import com.telefonica.futr.srv.nuc.test.service.TestService;
import com.telefonica.tran.comarq.cc.cabecera.TE_Cabecera;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@Component("webservice")
@WebService(targetNamespace = "http://telefonica.com/futr/srv-nuc-Test-v3", endpointInterface = "com.telefonica.futr.srv.nuc.test.facade.TestWebService", portName = "srv-nuc-Test_Port", serviceName = "srv-nuc-Test-v3")
public class TestWebServiceImpl implements TestWebService {

    @Autowired
    private TestService testService;

    @Override
    public ListWorksByState_OUT listWorksByState(ListWorksByState_IN in, Holder<TE_Cabecera> holderHeader,
            Holder<TE_Metadatos> holderMetadata) throws SoapTelcoException {

        return testService.listWorksByState(in);
    }

}
