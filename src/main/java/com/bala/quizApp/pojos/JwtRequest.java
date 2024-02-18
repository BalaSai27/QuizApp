package com.bala.quizApp.pojos;

import lombok.Data;

@Data
public class JwtRequest {

    private String username;
    private String password;
}
