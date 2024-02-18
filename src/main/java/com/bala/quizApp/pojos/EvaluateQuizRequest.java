package com.bala.quizApp.pojos;

import lombok.Data;

import java.util.List;

@Data
public class EvaluateQuizRequest {

    private Long quizId;
    private Long timeTaken;
    private List<QuestionResponse> questionResponses;
}
