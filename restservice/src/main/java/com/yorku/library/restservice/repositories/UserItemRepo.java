package com.yorku.library.restservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorku.library.restservice.models.UserItem;

public interface UserItemRepo extends JpaRepository<UserItem, Integer>{

}
