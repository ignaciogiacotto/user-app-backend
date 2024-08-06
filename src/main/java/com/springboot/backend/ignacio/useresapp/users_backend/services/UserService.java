package com.springboot.backend.ignacio.useresapp.users_backend.services;

import com.springboot.backend.ignacio.useresapp.users_backend.entities.User;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;

public interface UserService {
    List<User> findAll();

        Page<User> findAll(Pageable pageable);

    Optional <User> findById(@NonNull Long id);

    User save(User user);

    void deleteById(Long id);

    
}
