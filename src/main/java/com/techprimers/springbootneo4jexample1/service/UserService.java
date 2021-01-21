package com.techprimers.springbootneo4jexample1.service;

import com.techprimers.springbootneo4jexample1.model.User;
import com.techprimers.springbootneo4jexample1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
    public User adduser(User a){
      /*  changeprefbus(a);
        changepreftaxi(a);
        changepreftram(a);*/
        userRepository.adduser(a);
     /*   changepreftaxi(a);
        changepreftram(a);*/

        return a;

    }
   public User changepreftaxi(User a){
       return userRepository.changetaxi( a.getNom(),a.getNotetaxi());
    }
    public User changeprefbus(User a){
       return userRepository.changebus(a.getNom(),a.getNotebus());
    }
    public User changepreftram(User a){
        return userRepository.changetram(a.getNom(),a.getNotetram());
    }

}
