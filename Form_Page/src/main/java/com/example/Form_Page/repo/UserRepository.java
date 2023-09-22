package com.example.Form_Page.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Form_Page.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}
