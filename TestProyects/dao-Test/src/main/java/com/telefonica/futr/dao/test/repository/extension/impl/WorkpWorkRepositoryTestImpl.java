package com.telefonica.futr.dao.test.repository.extension.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.telefonica.futr.dao.test.repository.WorkpWorkRepository;
import com.telefonica.futr.dao.test.repository.extension.WorkpWorkRepositoryTest;
import com.telefonica.futr.model.WorkpWork;

public class WorkpWorkRepositoryTestImpl implements WorkpWorkRepositoryTest {
	
	@Autowired
    private WorkpWorkRepository workpWorkRepository;
	
	public Page<WorkpWork> findWorkByWOCode(String codeWO, BigDecimal idWO, Pageable page) {
		return workpWorkRepository.findWorkByWOCode(codeWO, idWO, page);
	}

	public WorkpWork findWorkByCode(String codeWork) {
		return workpWorkRepository.findWorkByCode(codeWork);
	}

}
