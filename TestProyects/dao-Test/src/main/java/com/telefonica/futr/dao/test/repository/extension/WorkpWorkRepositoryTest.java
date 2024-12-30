package com.telefonica.futr.dao.test.repository.extension;

import java.math.BigDecimal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.telefonica.futr.model.WorkpWork;

public interface WorkpWorkRepositoryTest {

    public Page<WorkpWork> findWorkByWOCode(String codeWO, BigDecimal idWO, Pageable page);
    public WorkpWork findWorkByCode(String codeWork);

}








