package com.example.sb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    private int currentId = 1;

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setId(currentId++);
        users.add(user);
        return user;
    }

    // READ ALL
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // READ ONE
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        Optional<User> userOpt = users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
        return userOpt.orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setAge(updatedUser.getAge());
                return user;
            }
        }
        return null;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.removeIf(user -> user.getId() == id);
        return "User with id " + id + " deleted";
    }
}
