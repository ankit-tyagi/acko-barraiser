package com.acko.newsLetter.Controller;


import com.acko.newsLetter.Model.User;
import com.acko.newsLetter.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User saveUser(@RequestBody User user){
        return userService.save(user);
    }

}
