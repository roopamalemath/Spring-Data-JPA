package com.in28minutes.learning.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.entity.User;
import com.in28minutes.learning.jpa.service.UserDAOService;
import com.in28minutes.learning.jpa.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log=LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user=new User("Rupa","Admin");
		User user1=userRepository.save(user);
		log.info("New User is created : "+user);
		
		Optional<User> fromdatabase=userRepository.findById(user.getId());
		log.info("New User is retrieved from database "+fromdatabase);
		
		List<User> users=userRepository.findAll();
		System.out.println(users);
	}


}
