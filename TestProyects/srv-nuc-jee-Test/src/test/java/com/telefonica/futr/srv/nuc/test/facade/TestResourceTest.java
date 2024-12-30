package com.telefonica.futr.srv.nuc.test.facade;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import com.telefonica.coco.boot.test.config.ResourceTest;

import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;
import com.telefonica.futr.srv.nuc.test.service.TestService;

@ResourceTest
class TestResourceTest {

    @Autowired
    private MockMvc mvc;

    @Value("${tap.web.context-path}")
    private String contextPath;

    @MockBean
    private TestService service;

    @Test
    void testListWorksByState() throws Exception {

        ListWorksByState_OUT out = new ListWorksByState_OUT();

        given(service.listWorksByState(any())).willReturn(out);

        RequestBuilder request = post(contextPath + "///listWorksByState").contentType(MediaType.APPLICATION_JSON)
                .content("{}");

        mvc.perform(request).andExpect(status().isOk()).andExpect(jsonPath("$").exists());

        verify(service).listWorksByState(isNotNull());
    }


}
