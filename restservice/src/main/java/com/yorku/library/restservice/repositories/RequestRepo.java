package com.yorku.library.restservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorku.library.restservice.models.Request;

public interface RequestRepo extends JpaRepository<Request, Integer>{

}
