package com.example.tasklambdaexpressions.controller;


import com.example.tasklambdaexpressions.bo.CreateSuggestionRequest;
import com.example.tasklambdaexpressions.repository.GuestSuggestionRepository;
import com.example.tasklambdaexpressions.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SuggestionController {

    private final GuestSuggestionService guestSuggestionService;

    public SuggestionController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @PostMapping("/suggestions")
    public void handleSuggestion(@RequestBody CreateSuggestionRequest request) {

    guestSuggestionService.printAndProcessSuggestion(request.getSuggestionText());

    }

    @GetMapping("/suggestions")
    public void handleSuggestionBack() {

        guestSuggestionService.printAndProcessSuggestion(guestSuggestionService.toString());


    }

}//end of class
