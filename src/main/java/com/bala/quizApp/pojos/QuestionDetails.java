package com.bala.quizApp.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionDetails {

    private String question;
    private String category;
    private String difficulty;
    private String correct_answer;
    private Options answers;
}
