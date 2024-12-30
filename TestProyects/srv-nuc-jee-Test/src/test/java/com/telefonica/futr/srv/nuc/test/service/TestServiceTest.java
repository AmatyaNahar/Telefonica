package com.telefonica.futr.srv.nuc.test.service;

import static com.telefonica.coco.core.domain.exceptions.TechnicalExceptionType.ERROR_VALIDACION;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.coco.boot.test.config.ServiceTest;
import com.telefonica.coco.core.domain.exceptions.TechnicalException;
import com.telefonica.futr.srv.nuc.test.msg.listworksbystate.ListWorksByState_IN;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@Disabled // TODO Remove this annotation after coding integration tests
@ServiceTest
@Transactional
@Sql(scripts = "/data/insert.sql")
class TestServiceTest {

    @Autowired
    private TestService testService;

    // TODO @MockBean your external dependencies here (cliews, cliers)

    @Test
    void testListWorksByState() throws TE_Excepcion {
        // Given
        ListWorksByState_IN in = null;
        // When
        Throwable t = catchThrowable(() -> testService.listWorksByState(in));
        // Then
        assertThat(t).isInstanceOf(TechnicalException.class);
        assertThat(((TechnicalException) t).getFaultInfo().getErrorId()).isEqualTo(ERROR_VALIDACION.code());
    }

}
