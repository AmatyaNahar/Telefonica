
package com.telefonica.futr.srv.nuc.test.msg.listworksbystate;

import java.io.Serializable;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for ListWorksByState_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="ListWorksByState_OUT"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Work" type="{http://telefonica.com/futr/srv/Test/msg/listWorksByState-v6}Work_DTO_OUT"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListWorksByState_OUT", propOrder = { "works" })
@XmlRootElement(name = "ListWorksByState_OUT")
public class ListWorksByState_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Work")
    @Valid
    protected com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[] works;

    /**
     * 
     * 
     * @return array of {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[] getWorks() {
        if (this.works == null) {
            return new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[0];
        }
        com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[] retVal = new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[this.works.length];
        System.arraycopy(this.works, 0, retVal, 0, this.works.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return one of {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT getWorks(int idx) {
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
     *            allowed objects are {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT }
     * 
     */
    public void setWorks(com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[] values) {
        int len = values.length;
        this.works = ((com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[]) new com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT[len]);
        for (int i = 0; (i < len); i++) {
            this.works[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *            allowed object is {@link com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT }
     * 
     */
    public com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT setWorks(int idx,
            com.telefonica.futr.srv.nuc.test.msg.listworksbystate.Work_DTO_OUT value) {
        return this.works[idx] = value;
    }

}
