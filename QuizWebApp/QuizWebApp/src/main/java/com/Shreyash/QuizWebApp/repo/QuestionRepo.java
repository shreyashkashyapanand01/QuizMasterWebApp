package com.Shreyash.QuizWebApp.repo;

import com.Shreyash.QuizWebApp.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion, Long> {

}
