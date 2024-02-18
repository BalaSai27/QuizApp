package com.bala.quizApp.pojos;

import com.bala.quizApp.models.UserQuizMapping;
import lombok.Data;

@Data
public class UserQuizDetails {

    private Long userId;
    private Long quizId;
    private int score;
    private Long timeTaken;
    private String username;
}
