package com.techelevator.dao;

import com.techelevator.model.Message;

public interface MessageDao {

    Message getMessage();

    Message getFirstMessage();

    Message getMessageByKeyWords(String needCategory, String keyword1, String keyword2);

    Message getMessageByKeyWords2(String keyword1, String keyword2);


}
