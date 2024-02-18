package com.bala.quizApp.pojos;

import com.bala.quizApp.models.Quiz;
import lombok.Data;

@Data
public class CreateQuizResponse {

    private Quiz quiz;
    private ResultInfo resultInfo;
}
