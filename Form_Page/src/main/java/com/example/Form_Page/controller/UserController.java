// package com.example.Form_Page.controller;
//
// import java.util.List;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
// import com.example.Form_Page.model.User;
// import com.example.Form_Page.repo.UserRepository;
//
// @RestController
// @RequestMapping("/Users")
// @CrossOrigin(origins = "http://localhost:3000")
// public class UserController {
//
// @Autowired
// private UserRepository userRepository;
//
// @PostMapping("/add")
// public User addUser(@RequestBody User user) {
//
// return this.userRepository.save(user);
// }
//
// @GetMapping("/all")
// public List<User> getAllUsers() {
//
// return this.userRepository.findAll();
// }
// }