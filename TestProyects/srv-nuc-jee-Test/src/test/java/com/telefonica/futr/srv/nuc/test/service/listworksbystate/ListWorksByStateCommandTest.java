package com.telefonica.futr.srv.nuc.test.service.listworksbystate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@ExtendWith(MockitoExtension.class)
class ListWorksByStateCommandTest {

    @InjectMocks
    private ListWorksByStateCommand testCommand = new ListWorksByStateCommand();

    @Mock
    private ListWorksByStateMapper mapper;

    @Test
    void testListWorksByState() throws TE_Excepcion {
        // Given
        ListWorksByState_IN in = null;
        // When
        ListWorksByState_OUT out = testCommand.execute(in);
        // Then
        assertThat(out).isNull();
    }
}
