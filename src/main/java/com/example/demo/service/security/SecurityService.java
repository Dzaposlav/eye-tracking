package com.example.demo.service.security;

/**
 * Created by fdzapo on 27-Feb-19.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
