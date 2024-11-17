package com.example.tasklambdaexpressions.repository;

import com.example.tasklambdaexpressions.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {



}//end of class
