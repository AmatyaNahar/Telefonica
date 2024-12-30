package com.telefonica.futr.srv.nuc.test.facade;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.telefonica.coco.boot.test.config.WebServiceTest;
import com.telefonica.coco.ws.test.WebServiceUtils;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;
import com.telefonica.futr.srv.nuc.test.service.TestService;

@WebServiceTest(logging = true)
class TestWebServiceTest {

    TestWebService webServiceClient;

    @MockBean
    private TestService mockService;

    @Autowired
    private WebServiceUtils wsUtils;

    @BeforeEach
    public void setup() {

        webServiceClient = wsUtils.createClient(TestWebService.class);
    }

    @Test
    void testListWorksByState() throws Exception {

        // Given
        ListWorksByState_OUT expected = new ListWorksByState_OUT();
        given(mockService.listWorksByState(any())).willReturn(expected);

        // When
        ListWorksByState_OUT out = webServiceClient.listWorksByState(new ListWorksByState_IN(), null, null);

        // Then
        assertThat(out).isNotSameAs(expected);
        assertThat(out).usingRecursiveComparison().isEqualTo(expected);
    }
}
