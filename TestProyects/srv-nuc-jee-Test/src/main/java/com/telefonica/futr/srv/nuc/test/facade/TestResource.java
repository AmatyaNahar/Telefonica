package com.telefonica.futr.srv.nuc.test.facade;

import static org.springframework.http.HttpStatus.OK;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telefonica.coco.data.domain.MetadataResponse;
import com.telefonica.coco.web.domain.MetadataDefaults;
import com.telefonica.coco.web.domain.StatusCodeMappingContributor;

import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;

import com.telefonica.futr.srv.nuc.test.service.TestService;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@RestController
@RequestMapping("${tap.web.context-path}")
public class TestResource implements StatusCodeMappingContributor {

    @Autowired
    private TestService testService;


    @PostMapping("/listWorksByState")
    public ResponseEntity<ListWorksByState_OUT> listWorksByState(@RequestBody ListWorksByState_IN in)
            throws TE_Excepcion {
        ListWorksByState_OUT out = testService.listWorksByState(in);
        return ResponseEntity.status(OK).body(out);
    }

    @Override
    public void addStatusCodeMappings(Map<String, HttpStatus> map) {
        // TODO: Concretar los mapeos con los códigos de error correctos

    }

}
