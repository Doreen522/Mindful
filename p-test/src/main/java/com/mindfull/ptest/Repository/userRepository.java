package com.mindfull.ptest.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mindfull.ptest.model.User;

public interface userRepository extends MongoRepository <User, String>{

}
