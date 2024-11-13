
package com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerRequest }
     * 
     * @return
     *     the new instance of {@link CustomerRequest }
     */
    public CustomerRequest createCustomerRequest() {
        return new CustomerRequest();
    }

    /**
     * Create an instance of {@link Acknowledgement }
     * 
     * @return
     *     the new instance of {@link Acknowledgement }
     */
    public Acknowledgement createAcknowledgement() {
        return new Acknowledgement();
    }

}
