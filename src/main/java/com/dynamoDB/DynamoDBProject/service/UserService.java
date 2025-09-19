package com.dynamoDB.DynamoDBProject.service;

import com.dynamoDB.DynamoDBProject.entity.User;
import com.dynamoDB.DynamoDBProject.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        repository.save(user);
    }

    public User getUser(String userId) {
        return repository.findById(userId);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public void updateUser(User user) {
        repository.save(user);
    }

    public void deleteUser(String userId) {
        repository.delete(userId);
    }
}
