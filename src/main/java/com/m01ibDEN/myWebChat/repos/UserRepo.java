package com.m01ibDEN.myWebChat.repos;

import com.m01ibDEN.myWebChat.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
