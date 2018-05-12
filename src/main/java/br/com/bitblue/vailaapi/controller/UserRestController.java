
package br.com.bitblue.vailaapi.controller;

import br.com.bitblue.vailaapi.model.User;
import br.com.bitblue.vailaapi.repository.UserRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserRestController{

    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody User user){
        
        User LoggedUser = userRepository.login(user.getEmail(), user.getPassword());
        
        if(LoggedUser == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        
        return ResponseEntity.ok().build();
        
    }
    
    @PostMapping("/register")
    public User register(@Valid @RequestBody User user){
        return userRepository.save(user);
    }
    
}
