package com.in28minutes.learning.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.entity.User;

// this implementation is provided by spring data jpa
// entity you want to manage is user
// primary key of the user is long
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
