package com.telefonica.futr.srv.nuc.testlocal.service.getworkstate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_IN;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@ExtendWith(MockitoExtension.class)
class GetWorkStateCommandTest {

    @InjectMocks
    private GetWorkStateCommand workStateLocalCommand = new GetWorkStateCommand();

    @Mock
    private GetWorkStateMapper mapper;

    @Test
    void testGetWorkState() throws TE_Excepcion {
        // Given
        GetWorkState_IN in = null;
        // When
        GetWorkState_OUT out = workStateLocalCommand.execute(in);
        // Then
        assertThat(out).isNull();
    }
}
