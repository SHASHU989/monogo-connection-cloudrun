package com.org.hul.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.hul.entity.UserQgpRssmLevel;
@Repository
public interface UserQgpRssmLevelRepo extends MongoRepository<UserQgpRssmLevel, String>{

}
