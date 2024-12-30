package com.telefonica.futr.dao.test.repository;

import java.math.BigDecimal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.telefonica.futr.dao.test.repository.extension.WorkpWorkRepositoryTest;
import com.telefonica.futr.model.WorkpWork;

@Repository(value = "com.telefonica.futr.dao.test.repository.WorkpWorkRepository")
public interface WorkpWorkRepository
		extends JpaRepository<WorkpWork, BigDecimal>, JpaSpecificationExecutor<WorkpWork>, WorkpWorkRepositoryTest {
	@Query("SELECT w FROM WorkpWork w WHERE w.buinIdWfWorkOrder = :idWO OR w.woorpWfWorkOrderItems.woorpWfWorkOrder.buinCoWfWorkOrder = :codeWO")
	Page<WorkpWork> findWorkByWOCode(@Param("codeWO") String codeWO, @Param("idWO") BigDecimal idWO, Pageable pageable);

	@Query("SELECT w FROM WorkpWork w WHERE w.workCoWork = :codeWork")
	WorkpWork findWorkByCode(@Param("codeWork") String codeWork);
}
