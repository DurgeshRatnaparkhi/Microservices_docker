package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/api")
public interface LoansClient {

    @GetExchange(value = "/fetch", accept = "application/json")
    ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam String mobileNumber);
}

//This code is used to call Loan Service from Account Service.
// LoansClient is a declarative HTTP client. It allows one microservice to call another microservice using an interface,
// without manually writing HTTP request code.