package com.techelevator.dao;

import com.techelevator.model.Quotes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component

public class JdbcQuotesDao implements QuotesDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcQuotesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Quotes getQuoteById() {
        int id = getRandomNumber();
        //Quotes quotes = new Quotes();
        return null;
    }
    private int getRandomNumber() {
        int rand = 0;
        int max = 30;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 30; i++) {
            rand = (int) (Math.random() * range) + min;

        }
        return rand;
    }
}
