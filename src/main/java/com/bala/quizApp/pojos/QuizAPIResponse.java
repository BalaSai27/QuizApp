package com.bala.quizApp.pojos;

import lombok.Data;

import java.util.List;

@Data
public class QuizAPIResponse {

    List<QuestionDetails> questionDetails;
}
