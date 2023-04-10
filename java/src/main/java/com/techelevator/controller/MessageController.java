package com.techelevator.controller;


import com.techelevator.dao.MessageDao;
import com.techelevator.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageDao messageDao;

    @RequestMapping(path = "/messages", method = RequestMethod.POST)
    public Message getMessage() {
        Message newMessage = messageDao.getMessage();
        return newMessage;
    }



}
