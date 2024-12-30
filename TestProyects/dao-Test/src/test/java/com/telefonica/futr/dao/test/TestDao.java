package com.telefonica.futr.dao.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.telefonica.coco.boot.config.Application;
import com.telefonica.futr.dao.test.repository.WorkpWorkRepository;
import com.telefonica.futr.model.WorkpWork;

@Application
public class TestDao {
	
	 @Mock
	    private WorkpWorkRepository workpWorkRepository;

	    private Pageable pageable;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.initMocks(this);
	        pageable = PageRequest.of(0, 10);
	    }

	    @Test
	    void testFindWorkByWOCode() {
	        // Arrange
	        String codeWO = "testCodeWO";
	        BigDecimal idWO = new BigDecimal(12345);
	        WorkpWork work1 = new WorkpWork();
	        WorkpWork work2 = new WorkpWork();
	        Page<WorkpWork> mockPage = new PageImpl<>(Arrays.asList(work1, work2), pageable, 2);

	        when(workpWorkRepository.findWorkByWOCode(codeWO, idWO, pageable)).thenReturn(mockPage);

	        // Act
	        Page<WorkpWork> result = workpWorkRepository.findWorkByWOCode(codeWO, idWO, pageable);

	        // Assert
	        assertNotNull(result);
	        assertEquals(2, result.getTotalElements());
	        verify(workpWorkRepository, times(1)).findWorkByWOCode(codeWO, idWO, pageable);
	    }

	    @Test
	    void testFindWorkByCode() {
	        // Arrange
	        String codeWork = "testCodeWork";
	        WorkpWork mockWork = new WorkpWork();

	        when(workpWorkRepository.findWorkByCode(codeWork)).thenReturn(mockWork);

	        // Act
	        WorkpWork result = workpWorkRepository.findWorkByCode(codeWork);

	        // Assert
	        assertNotNull(result);
	        verify(workpWorkRepository, times(1)).findWorkByCode(codeWork);
	    }
}
