package com.bala.quizApp.pojos;

import com.bala.quizApp.models.Question;
import lombok.Data;

import java.util.List;

@Data
public class EvaluateQuizResponse {

    private Long quizId;
    private int score;
    private List<Question> questions;
    private ResultInfo resultInfo;
}
