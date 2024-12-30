
package com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkState_IN", propOrder = { "work" })
@XmlRootElement(name = "GetWorkState_IN")
public class GetWorkState_IN implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Work", required = true)
    @NotNull
    @Valid
    protected Work_DTO_IN work;

   
    public Work_DTO_IN getWork() {
        return work;
    }


    public void setWork(Work_DTO_IN value) {
        this.work = value;
    }

}
