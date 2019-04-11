package com.example.demo.data.repository;

import com.example.demo.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fdzapo on 27-Feb-19.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}