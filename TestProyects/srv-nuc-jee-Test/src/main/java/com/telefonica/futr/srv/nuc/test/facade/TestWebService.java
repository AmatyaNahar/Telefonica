package com.telefonica.futr.srv.nuc.test.facade;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;

import com.telefonica.coco.ws.domain.exceptions.SoapTelcoException;

import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;

import com.telefonica.tran.comarq.cc.cabecera.TE_Cabecera;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@WebService(name = "srv-nuc-Test_WebService", targetNamespace = "http://telefonica.com/futr/srv-nuc-Test-v3")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ObjectFactory.class,
        com.telefonica.tran.comarq.cc.cabecera.ObjectFactory.class,
        com.telefonica.tran.comarq.cc.error.fault.ObjectFactory.class,
        com.telefonica.tran.comarq.cc.metadatos.ObjectFactory.class })
public interface TestWebService {

    /**
     * 
     * @param request
     * @param teHeader
     * @param teMetadata
     * @return returns com.telefonica.futr.srv.nuc.tet.msg.listworksbystate.ListWorksByState_OUT
     * @throws SoapTelcoException
     */
    @WebMethod(action = "listWorksByState")
    @WebResult(name = "ListWorksByState_OUT", targetNamespace = "http://telefonica.com/futr/srv/Test/msg/listWorksByState-v6", partName = "response")
    ListWorksByState_OUT listWorksByState(
            @WebParam(name = "ListWorksByState_IN", targetNamespace = "http://telefonica.com/futr/srv/Test/msg/listWorksByState-v6", partName = "request") ListWorksByState_IN in,
            @WebParam(name = "TE_Cabecera", targetNamespace = "http://telefonica.com/tran/comarq/cc/cabecera", header = true, mode = WebParam.Mode.INOUT, partName = "te_header") Holder<TE_Cabecera> holderHeader,
            @WebParam(name = "TE_Metadatos", targetNamespace = "http://telefonica.com/tran/comarq/cc/metadatos-2.0", header = true, mode = WebParam.Mode.INOUT, partName = "te_metadata") Holder<TE_Metadatos> holderMetadata)
            throws SoapTelcoException;

}
