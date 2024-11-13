package com.github.bruce_mig.loan_eligibility_soap_ws_client.client;

import com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility.Acknowledgement;
import com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility.CustomerRequest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {
    
    private final Jaxb2Marshaller marshaller;

    public SoapClient(Jaxb2Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public Acknowledgement getLoanStatus(CustomerRequest request) {
        WebServiceTemplate template = new WebServiceTemplate(marshaller);
        return (Acknowledgement) template.marshalSendAndReceive("http://localhost:8080/ws", request);
    }
}
