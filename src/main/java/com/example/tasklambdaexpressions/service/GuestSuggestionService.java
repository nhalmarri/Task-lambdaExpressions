package com.example.tasklambdaexpressions.service;

import com.example.tasklambdaexpressions.SuggestionProcessor;
import com.example.tasklambdaexpressions.entity.GuestSuggestionEntity;
import com.example.tasklambdaexpressions.repository.GuestSuggestionRepository;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
public class GuestSuggestionService {

    private  GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionService(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }



    SuggestionProcessor suggestionGeneretor = text -> {

        GuestSuggestionEntity suggestionText = new GuestSuggestionEntity();
        suggestionText.setSuggestionText(text);
        guestSuggestionRepository.save(suggestionText);

    };

    public void printAndProcessSuggestion(String text) {

       System.out.println("Success Message!!");

    }






}//end of class





