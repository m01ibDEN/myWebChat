package com.m01ibDEN.myWebChat.repos;

import com.m01ibDEN.myWebChat.models.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<ChatMessage, Integer> {

}