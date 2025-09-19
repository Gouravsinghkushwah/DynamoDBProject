package com.dynamoDB.DynamoDBProject.controller;

import com.dynamoDB.DynamoDBProject.entity.User;
import com.dynamoDB.DynamoDBProject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService service;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        service.createUser(user);
        return ResponseEntity.ok("User created successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        User user = service.getUser(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable String id, @RequestBody User user) {
        user.setUserId(id);
        service.updateUser(user);
        return ResponseEntity.ok("User updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        service.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }

    // this line for testing purpose for merge

    @GetMapping
    public String testMerge() {
        return "Merge successful!";
    }
}

