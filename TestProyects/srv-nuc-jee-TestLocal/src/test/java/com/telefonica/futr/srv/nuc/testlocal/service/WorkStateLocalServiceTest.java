package com.telefonica.futr.srv.nuc.testlocal.service;

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
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_IN;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Disabled // TODO Remove this annotation after coding integration tests
@ServiceTest
@Transactional
@Sql(scripts = "/data/insert.sql")
class WorkStateLocalServiceTest {

    @Autowired
    private TestLocalService testLocalService;

    // TODO @MockBean your external dependencies here (cliews, cliers)


    @Test
    void testGetWorkState() throws TE_Excepcion {
        // Given
        GetWorkState_IN in = null;
        // When
        Throwable t = catchThrowable(() -> testLocalService.getWorkState(in));
        // Then
        assertThat(t).isInstanceOf(TechnicalException.class);
        assertThat(((TechnicalException) t).getFaultInfo().getErrorId()).isEqualTo(ERROR_VALIDACION.code());
    }

}
