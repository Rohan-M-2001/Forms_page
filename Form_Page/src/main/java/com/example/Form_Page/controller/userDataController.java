package com.example.Form_Page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Form_Page.model.BasicData;
import com.example.Form_Page.model.CombinedUserData;
import com.example.Form_Page.model.QuestionData;
import com.example.Form_Page.model.User;
import com.example.Form_Page.repo.UserRepository;

/**
 * TODO romitra This type ...
 *
 */
@RestController
@RequestMapping("/Users")
@CrossOrigin(origins = "http://localhost:3000")
public class userDataController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/addUser")
  public User addUser(@RequestBody CombinedUserData userData) {

    // Extract basic data and question data from userData
    BasicData basicData = userData.getBasicData();
    QuestionData questionData = userData.getQuestionData();

    // Create a new User entity
    User user = new User();

    // Populate the User object with data from basicData and questionData
    user.setName(basicData.getName());
    user.setEmail(basicData.getEmail());
    user.setContact(basicData.getContact());
    user.setReportingToBase(basicData.getReportingToBase());
    user.setNotReportingReason(basicData.getNotReportingReason());
    user.setCertifications(basicData.getCertifications());
    user.setBenchStatus(basicData.getBenchStatus());
    user.setProfession(questionData.getProfession());
    user.setInterest(questionData.getInterest());
    user.setReference(questionData.getReference());

    // Save the combined data to the database
    User savedUser = this.userRepository.save(user);

    // Return the saved user data (if needed)
    return savedUser;
  }
}