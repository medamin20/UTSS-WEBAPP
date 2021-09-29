package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.utss.model.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
