package com.techelevator.controller;

import com.techelevator.dao.QuotesDao;
import com.techelevator.model.Quotes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class QuotesController {
    private QuotesDao quotesDao;

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quotes getQuote() {
    return null;
    }
}



