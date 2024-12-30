
package com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate package. &lt;p&gt;An ObjectFactory allows you to
 * programatically construct new instances of the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the binding of schema type definitions,
 * element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.telefonica.futr.srv.nuc.testlocal.msg.getworkstate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWorkState_IN }
     * 
     */
    public GetWorkState_IN createGetWorkState_IN() {
        return new GetWorkState_IN();
    }

    /**
     * Create an instance of {@link Work_DTO_IN }
     * 
     */
    public Work_DTO_IN createWork_DTO_IN() {
        return new Work_DTO_IN();
    }

    /**
     * Create an instance of {@link GetWorkState_OUT }
     * 
     */
    public GetWorkState_OUT createGetWorkState_OUT() {
        return new GetWorkState_OUT();
    }

    /**
     * Create an instance of {@link WorkState_DTO_OUT }
     * 
     */
    public WorkState_DTO_OUT createWorkState_DTO_OUT() {
        return new WorkState_DTO_OUT();
    }

}
