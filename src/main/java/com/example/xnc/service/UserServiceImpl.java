package com.example.xnc.service;

import com.example.xnc.model.Users;
import com.example.xnc.reponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<Users> findUserByID(long id) {
        return userRepository.findUsersById(id);
    }

    @Override
    public Users getOne(long id) {
        return findUserByID(id).get();
    }

    @Override
    public Optional<Users> findUserByUsername(String name) {
        return userRepository.findByUsername(name);
    }
}
