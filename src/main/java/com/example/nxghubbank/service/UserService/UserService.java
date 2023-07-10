package com.example.nxghubbank.service.UserService;

import com.example.nxghubbank.dto.BankResponse;
import com.example.nxghubbank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
}
