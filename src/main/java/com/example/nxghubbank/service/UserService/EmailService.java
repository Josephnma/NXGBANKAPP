package com.example.nxghubbank.service.UserService;

import com.example.nxghubbank.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlerts(EmailDetails emailDetails);
}

