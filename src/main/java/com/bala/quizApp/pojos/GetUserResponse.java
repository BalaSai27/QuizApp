package com.bala.quizApp.pojos;

import lombok.Data;

@Data
public class GetUserResponse {

    private Long userId;
    private String username;
    private ResultInfo resultInfo;
}
