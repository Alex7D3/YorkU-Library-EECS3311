package com.yorku.library.restservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorku.library.restservice.models.UserItem;
import com.yorku.library.restservice.models.UserItemPrimaryKey;

public interface UserItemRepo extends JpaRepository<UserItem, UserItemPrimaryKey>{

}
