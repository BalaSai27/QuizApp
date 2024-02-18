package com.bala.quizApp.pojos;

import lombok.Data;

@Data
public class UserSignUpRequest {

    private String username;
    private String password;
    private String passwordConfirmation;
}
