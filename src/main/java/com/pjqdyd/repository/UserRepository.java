package com.pjqdyd.repository;

import com.pjqdyd.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * UserRepository层
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findById(long id);

}
