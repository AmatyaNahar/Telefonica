package com.telefonica.futr.dao.test.repository.extension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.coco.boot.test.config.RepositoryTest;
import com.telefonica.futr.dao.test.repository.WorkpWorkRepository;
import com.telefonica.futr.dao.test.repository.extension.impl.WorkpWorkRepositoryTestImpl;
import com.telefonica.futr.model.WorkpWork;

@DataJpaTest
@RepositoryTest
@Transactional
@Sql(scripts = "/data/insert.sql")
public class WorkpWorkRepositoryTestTest {
	
	@InjectMocks
    private WorkpWorkRepositoryTestImpl workpWorkRepositoryTestImpl; // Class to test

    @Mock
    private WorkpWorkRepository workpWorkRepository; // Mocked repository

    @Mock
    private Page<WorkpWork> workpWorkPage; // Mocked page object

    private Pageable pageable;
    private BigDecimal idWO;
    private String codeWO;
    private String codeWork;

    @Before
    public void setUp() {
        // Initialize mocks
        MockitoAnnotations.initMocks(this);

        // Sample data for the tests
        pageable = PageRequest.of(0, 10);  // example Pageable
        idWO = new BigDecimal(12345);
        codeWO = "WO123";
        codeWork = "WORK123";
    }

    @Test
    public void testFindWorkByWOCode() {
        // Arrange
        when(workpWorkRepository.findWorkByWOCode(codeWO, idWO, pageable)).thenReturn(workpWorkPage);

        // Act
        Page<WorkpWork> result = workpWorkRepositoryTestImpl.findWorkByWOCode(codeWO, idWO, pageable);

        // Assert
        assertNotNull(result);
        verify(workpWorkRepository, times(1)).findWorkByWOCode(codeWO, idWO, pageable);
    }

    @Test
    public void testFindWorkByCode() {
        // Arrange
        WorkpWork mockWorkpWork = new WorkpWork();
        mockWorkpWork._persistence_set_workCoWork(codeWork);
        when(workpWorkRepository.findWorkByCode(codeWork)).thenReturn(mockWorkpWork);

        // Act
        WorkpWork result = workpWorkRepositoryTestImpl.findWorkByCode(codeWork);

        // Assert
        assertNotNull(result);
        assertEquals(codeWork, result._persistence_get_workCoWork());
        verify(workpWorkRepository, times(1)).findWorkByCode(codeWork);
    }
}
