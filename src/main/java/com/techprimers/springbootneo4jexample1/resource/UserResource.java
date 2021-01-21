package com.techprimers.springbootneo4jexample1.resource;

import com.techprimers.springbootneo4jexample1.model.User;
import com.techprimers.springbootneo4jexample1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/")
public class UserResource {

    @Autowired
    UserService userService;


    @GetMapping("allusers")
    public Collection<User> getAll() {
        return userService.getAll();
    }
    @PostMapping("/adduser")
    public User adduser(@RequestBody User e){

         userService.adduser(e);
         return   userService.changeprefbus(e);


    }




}
