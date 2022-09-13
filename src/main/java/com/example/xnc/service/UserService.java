package com.example.xnc.service;

import com.example.xnc.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<Users> getAllUser();

    void saveUser(Users user);

    void deleteUser(long id);

    Optional<Users> findUserByID(long id);

    Users getOne(long id);

    Optional<Users> findUserByUsername(String name);
}
