package com.eyup.mitek.mitektester.controller;

import com.eyup.mitek.mitektester.model.Users;
import com.eyup.mitek.mitektester.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping("/all")
    public List<Users> findAll() {
        return userJpaRepository.findAll();
    }

    // Eyup Cingel olarak bu dosyayi save ediyorum

    @GetMapping("/{name}")
    public Users getUser(@PathVariable String name) {
        return userJpaRepository.findByName(name);
    }

    @PostMapping("/load")
    public Users load(@RequestBody Users users) {
        userJpaRepository.save(users);
        return userJpaRepository.findByName(users.getName());
    }
}
