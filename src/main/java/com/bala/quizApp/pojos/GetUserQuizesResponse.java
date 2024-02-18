package com.bala.quizApp.pojos;

import com.bala.quizApp.models.Quiz;
import lombok.Data;

import java.util.List;

@Data
public class GetUserQuizesResponse {

    private String userId;
    private ResultInfo resultInfo;
    private List<QuizWrapper> quizzes;
}
