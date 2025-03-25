package com.magalhaes.mongodb_Project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.magalhaes.mongodb_Project.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
