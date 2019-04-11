package com.example.demo.service.security;

import com.example.demo.data.model.User;

/**
 * Created by fdzapo on 27-Feb-19.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
