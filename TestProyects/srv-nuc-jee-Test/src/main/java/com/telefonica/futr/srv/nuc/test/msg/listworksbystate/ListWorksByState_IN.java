
package com.telefonica.futr.srv.nuc.test.msg.listworksbystate;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for ListWorksByState_IN complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="ListWorksByState_IN"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Work"
 * type="{http://telefonica.com/futr/srv/Test/msg/listWorksByState-v6}Work_DTO_IN" maxOccurs="unbounded"/&amp;gt;
 * &amp;lt;element name="WorkState"
 * type="{http://telefonica.com/futr/srv/Test/msg/listWorksByState-v6}WorkState_DTO_IN"
 * maxOccurs="unbounded"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListWorksByState_IN", propOrder = { "works", "workStates" })
@XmlRootElement(name = "ListWorksByState_IN")
public class ListWorksByState_IN implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Work", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[] works;
    @XmlElement(name = "WorkState", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[] workStates;

    /**
     * 
     * 
     * @return array of {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[] getWorks() {
        if (this.works == null) {
            return new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[0];
        }
        com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[] retVal = new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[this.works.length];
        System.arraycopy(this.works, 0, retVal, 0, this.works.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return one of {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN getWorks(int idx) {
        if (this.works == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.works[idx];
    }

    public int getWorksLength() {
        if (this.works == null) {
            return 0;
        }
        return this.works.length;
    }

    /**
     * 
     * 
     * @param values
     *            allowed objects are {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN }
     * 
     */
    public void setWorks(com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[] values) {
        int len = values.length;
        this.works = ((com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[]) new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN[len]);
        for (int i = 0; (i < len); i++) {
            this.works[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *            allowed object is {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN setWorks(int idx,
            com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_IN value) {
        return this.works[idx] = value;
    }

    /**
     * 
     * 
     * @return array of {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[] getWorkStates() {
        if (this.workStates == null) {
            return new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[0];
        }
        com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[] retVal = new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[this.workStates.length];
        System.arraycopy(this.workStates, 0, retVal, 0, this.workStates.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return one of {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN getWorkStates(int idx) {
        if (this.workStates == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.workStates[idx];
    }

    public int getWorkStatesLength() {
        if (this.workStates == null) {
            return 0;
        }
        return this.workStates.length;
    }

    /**
     * 
     * 
     * @param values
     *            allowed objects are
     *            {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN }
     * 
     */
    public void setWorkStates(com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[] values) {
        int len = values.length;
        this.workStates = ((com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[]) new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN[len]);
        for (int i = 0; (i < len); i++) {
            this.workStates[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *            allowed object is {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN setWorkStates(int idx,
            com.telefonica.futr.srv.nuc.test.msg.listworksbystate.WorkState_DTO_IN value) {
        return this.workStates[idx] = value;
    }

}
