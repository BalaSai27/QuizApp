package com.bala.quizApp.controllers;


import com.bala.quizApp.models.Question;
import com.bala.quizApp.pojos.EvaluateQuizRequest;
import com.bala.quizApp.pojos.EvaluateQuizResponse;
import com.bala.quizApp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public String getAllQuestions() {
        return "these are the questions!";
    }

    @PostMapping("storeQuestions")
    public ResponseEntity<List<Question>> storeQuestions(@RequestParam String limit) {

        List<Question> questionList = questionService.storeQuestions(limit);
        return new ResponseEntity<>(questionList, HttpStatus.OK);
    }
}
