package com.example.tasklambdaexpressions.service;

import com.example.tasklambdaexpressions.SuggestionProcessor;
import com.example.tasklambdaexpressions.entity.GuestSuggestionEntity;
import com.example.tasklambdaexpressions.entity.SuggestionStatus;
import com.example.tasklambdaexpressions.repository.GuestSuggestionRepository;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<GuestSuggestionEntity> findAllCreatedSuggestions() {

        return guestSuggestionRepository.findAll().stream()
                .filter(stat->stat.getSuggestionStatus()== SuggestionStatus.CREATE) .collect(Collectors.toList());


    }
    public List<GuestSuggestionEntity> findAllRemovedSuggestions() {

        return guestSuggestionRepository.findAll().stream()
                .filter(stat->stat.getSuggestionStatus()== SuggestionStatus.REMOVE) .collect(Collectors.toList());

    }



}//end of class





