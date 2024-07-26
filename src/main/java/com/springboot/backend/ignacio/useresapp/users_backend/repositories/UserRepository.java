package com.springboot.backend.ignacio.useresapp.users_backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.ignacio.useresapp.users_backend.entities.User;

public interface UserRepository extends CrudRepository <User, Long>{
    
}
