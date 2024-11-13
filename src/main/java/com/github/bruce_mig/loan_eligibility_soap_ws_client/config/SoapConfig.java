package com.github.bruce_mig.loan_eligibility_soap_ws_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility");
        return marshaller;
    }
}
