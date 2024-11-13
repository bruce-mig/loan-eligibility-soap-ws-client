package com.github.bruce_mig.loan_eligibility_soap_ws_client.controller;

import com.github.bruce_mig.loan_eligibility_soap_ws_client.client.SoapClient;
import com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility.Acknowledgement;
import com.github.bruce_mig.loan_eligibility_soap_ws_client.loan_eligibility.CustomerRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanEligibilityController {

    private final SoapClient client;

    public LoanEligibilityController(SoapClient client) {
        this.client = client;
    }

    @PostMapping("/get-loan-status")
    public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request){
        return client.getLoanStatus(request);
    }
}
