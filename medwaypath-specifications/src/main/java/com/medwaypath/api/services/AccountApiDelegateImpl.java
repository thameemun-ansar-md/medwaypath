package com.medwaypath.api.services;

import org.openapitools.api.AccountApi;
import org.openapitools.model.Account;
import org.openapitools.model.DepositRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Optional;

@RestController
public class AccountApiDelegateImpl implements AccountApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Void> depositToAccount(@Valid DepositRequest depositRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Account> getAccount() {
        Account account = new Account();
        account.setBalance(BigDecimal.ONE);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
}
