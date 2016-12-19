package com.template.repository;

import org.springframework.data.repository.CrudRepository;

import com.template.beans.User;

public interface UserRepository extends CrudRepository<User, Long >{

	User findByEmail(String email);
	
}
