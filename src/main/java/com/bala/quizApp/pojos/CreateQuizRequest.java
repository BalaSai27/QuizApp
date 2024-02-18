package com.bala.quizApp.pojos;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateQuizRequest {

    //CreateQuizRequest params
    private String title;
    private String category;
    private String difficulty;
    private int numOfQues;
}
