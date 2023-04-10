package com.techelevator.dao;

import com.techelevator.model.Message;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcMessageDao implements MessageDao{
    private final JdbcTemplate jdbcTemplate;

    public JdbcMessageDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Message getMessage() {
        Message message = new Message();
        int id =1;
        String sql = "SELECT message_text FROM bot_test_messages WHERE message_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
        if(result.next()){
            message.setMessageText(result.getString("message_text"));
            return message;
        }
        return null;
    }
}
