package com.m01ibDEN.myWebChat.service;

import com.m01ibDEN.myWebChat.models.ChatMessage;
import com.m01ibDEN.myWebChat.repos.MessageRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public void save(ChatMessage message) {
        messageRepo.save(message);
    }

    public List<ChatMessage> getMessages() {
        return messageRepo.findAll();
    }
}
