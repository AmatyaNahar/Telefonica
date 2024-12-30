package com.telefonica.futr.srv.nuc.testlocal.msg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.telefonica.coco.boot.test.config.PojoTestSupport;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_IN;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.GetWorkState_OUT;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.WorkState_DTO_OUT;
import com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate.Work_DTO_IN;

class PojoTest extends PojoTestSupport {

	
	@Test
    void testGetAndSetWork_STATE_IN() {
        // Arrange
        GetWorkState_IN getWorkStateIN = new GetWorkState_IN();
        Work_DTO_IN workDTO = new Work_DTO_IN();

        // Act
        getWorkStateIN.setWork(workDTO);

        // Assert
        assertNotNull(getWorkStateIN.getWork(), "Work should not be null after being set.");
        assertEquals(workDTO, getWorkStateIN.getWork(), "The retrieved Work object should match the one set.");
    }

    @Test
    void testDefaultConstructor_WORK_STATE_IN() {
        // Arrange & Act
        GetWorkState_IN getWorkStateIN = new GetWorkState_IN();

        // Assert
        assertNull(getWorkStateIN.getWork(), "Work should be null by default.");
    }
    
    @Test
    void testGetAndSetWork_State_OUT() {
        // Arrange
        GetWorkState_OUT getWorkStateOUT = new GetWorkState_OUT();
        WorkState_DTO_OUT workStateDTO = new WorkState_DTO_OUT();

        // Act
        getWorkStateOUT.setWorkState(workStateDTO);

        // Assert
        assertNotNull(getWorkStateOUT.getWorkState(), "WorkState should not be null after being set.");
        assertEquals(workStateDTO, getWorkStateOUT.getWorkState(), "The retrieved WorkState object should match the one set.");
    }

    @Test
    void testDefaultConstructor_WORK_STATE_OUT() {
        // Arrange & Act
        GetWorkState_OUT getWorkStateOUT = new GetWorkState_OUT();

        // Assert
        assertNull(getWorkStateOUT.getWorkState(), "WorkState should be null by default.");
    }
    
    @Test
    void testGetAndSetId_Work_DTO_IN() {
        // Arrange
        Work_DTO_IN workDTO = new Work_DTO_IN();
        BigDecimal expectedId = new BigDecimal("12345");

        // Act
        workDTO.setId(expectedId);

        // Assert
        assertNotNull(workDTO.getId(), "Id should not be null after being set.");
        assertEquals(expectedId, workDTO.getId(), "The retrieved Id should match the one set.");
    }

    @Test
    void testDefaultConstructor_Work_DTO_IN() {
        // Arrange & Act
        Work_DTO_IN workDTO = new Work_DTO_IN();

        // Assert
        assertNull(workDTO.getId(), "Id should be null by default.");
    }
    
    @Test
    void testGetAndSetId_WorkState_DTO_OUT() {
        // Arrange
        WorkState_DTO_OUT workStateDTO = new WorkState_DTO_OUT();
        Long expectedId = 12345L;

        // Act
        workStateDTO.setId(expectedId);

        // Assert
        assertNotNull(workStateDTO.getId(), "Id should not be null after being set.");
        assertEquals(expectedId, workStateDTO.getId(), "The retrieved Id should match the one set.");
    }

    @Test
    void testGetAndSetName_WorkState_DTO_OUT() {
        // Arrange
        WorkState_DTO_OUT workStateDTO = new WorkState_DTO_OUT();
        String expectedName = "Test Work State";

        // Act
        workStateDTO.setName(expectedName);

        // Assert
        assertNotNull(workStateDTO.getName(), "Name should not be null after being set.");
        assertEquals(expectedName, workStateDTO.getName(), "The retrieved Name should match the one set.");
    }

    @Test
    void testDefaultConstructor_WorkState_DTO_OUT() {
        // Arrange & Act
        WorkState_DTO_OUT workStateDTO = new WorkState_DTO_OUT();

        // Assert
        assertNull(workStateDTO.getId(), "Id should be null by default.");
        assertNull(workStateDTO.getName(), "Name should be null by default.");
    }


}
