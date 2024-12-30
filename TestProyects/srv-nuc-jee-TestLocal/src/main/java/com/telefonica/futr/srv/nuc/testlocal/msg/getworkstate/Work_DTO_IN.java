
package com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Work entity is used to record actual executed work, i.e. an instance of that entity is created for the actual
 * work described by the WorkSpecification. If there are characteristics defined for the WorkSpecification, the work
 * instance has a distinct value assigned for those characteristics. Instances of Work are associated to the
 * WorkOrderItem. The quantity attribute can be used if the same work has been done more than once identically (based on
 * the similar attribute in WorkOrderItem). #ESPANOL# La creacion de la work se puede realizar desde 2 procesos
 * distinto: - Por una peticion de trabajo desde uno de los procesos origen (CdR, Provision, Mantenimiento). En este
 * caso en la peticion se crea la WorkOrder y los distintos WorkOrderItem que componen el trabajo. En un segundo paso se
 * agrupan los woi en Work segun la direccion donde se ejecuta dicho item. - Por una reserva desde el selling: En este
 * caso se crea un trabajo teorico y las entidades Work, Appointment y WfEmployeeReservation. Pero no existiran WOI ya
 * que es previo a la orden de provision.
 * 
 * &lt;p&gt;Java class for Work_DTO_IN complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="Work_DTO_IN"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Id"
 * type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_DTO_IN", propOrder = { "id" })
public class Work_DTO_IN implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true)
    @NotNull
    protected BigDecimal id;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

}
