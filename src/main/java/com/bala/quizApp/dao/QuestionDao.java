package com.bala.quizApp.dao;

import com.bala.quizApp.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RAND() LIMIT :limit", nativeQuery = true)
    public List<Question> findRandomQuestionsByCategory(String category, int limit);

}
