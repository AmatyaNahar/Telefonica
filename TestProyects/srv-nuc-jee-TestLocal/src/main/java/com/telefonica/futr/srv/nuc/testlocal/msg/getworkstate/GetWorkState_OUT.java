
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
@XmlType(name = "GetWorkState_OUT", propOrder = { "workState" })
@XmlRootElement(name = "GetWorkState_OUT")
public class GetWorkState_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WorkState", required = true)
    @NotNull
    @Valid
    protected WorkState_DTO_OUT workState;


    public WorkState_DTO_OUT getWorkState() {
        return workState;
    }


    public void setWorkState(WorkState_DTO_OUT value) {
        this.workState = value;
    }

}
