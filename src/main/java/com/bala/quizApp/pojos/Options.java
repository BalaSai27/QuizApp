package com.bala.quizApp.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Options {

    //possible options from the quizAPI response
    private String answer_a;
    private String answer_b;
    private String answer_c;
    private String answer_d;
}
