package com.bala.quizApp.pojos;


import lombok.Data;

import java.util.List;

@Data
public class GetLeaderBoardResponse {

    List<UserQuizDetails> leaderBoard;
    private ResultInfo resultInfo;
}
