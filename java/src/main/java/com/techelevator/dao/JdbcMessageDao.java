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
            message.setMessageBody(result.getString("message_text"));
            return message;
        }
        return null;
    }

    @Override
    public Message getFirstMessage() {
        Message message = new Message();
        String sql = "SELECT response_text FROM response WHERE need_category = 'default';";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        if(result.next()){
            message.setMessageBody(result.getString("response_text"));
            return message;
        }
        return null;
    }

    @Override
    public Message getMessageByKeyWords(String needCategory, String keyword1, String keyword2) {
        Message message = new Message();
        String sql = "SELECT response_text FROM response WHERE need_category= ? AND keyword_1 = ? AND keyword_2 = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, needCategory, keyword1, keyword2);
        if(result.next()){
            message.setMessageBody(result.getString("response_text"));
            return message;
        }
        return null;
    }
}
