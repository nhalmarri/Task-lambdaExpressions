package com.example.tasklambdaexpressions.controller;

import com.example.tasklambdaexpressions.entity.GuestSuggestionEntity;
import com.example.tasklambdaexpressions.service.GuestSuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionStatusController {

    private final GuestSuggestionService guestSuggestionService;

    public SuggestionStatusController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @GetMapping("/createdSuggestions")
    public List<GuestSuggestionEntity> createdSuggestion() {

        return guestSuggestionService.findAllCreatedSuggestions();

    }

    @GetMapping("/removedSuggestions")
    public List<GuestSuggestionEntity> removedSuggestionBack() {

        return guestSuggestionService.findAllRemovedSuggestions();

    }







}//end of class
