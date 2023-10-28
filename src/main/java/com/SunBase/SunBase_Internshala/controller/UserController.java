package com.SunBase.SunBase_Internshala.controller;

import com.SunBase.SunBase_Internshala.dto.SignInInput;
import com.SunBase.SunBase_Internshala.dto.SignUpInput;
import com.SunBase.SunBase_Internshala.model.User;
import com.SunBase.SunBase_Internshala.service.AuthenticationService;
import com.SunBase.SunBase_Internshala.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("signup")
    public ResponseEntity<String> signup(@RequestBody SignUpInput signUpDto){

        String response;
        HttpStatus status;

        try{
            userService.signUp(signUpDto);
            response = "Sign up successful";
            status = HttpStatus.CREATED;
        }catch (Exception e){
            response = "Enter Valid Data";
            status = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<String>(response, status);
    }

    @PostMapping("signin")
    public ResponseEntity<String> signin(@RequestBody SignInInput signInDto){

        String response;
        HttpStatus status;

        try{
            userService.signIn(signInDto);
            response = "Sign in successful";
            status = HttpStatus.CREATED;
        }catch (Exception e){
            response = "User not exist.... Sign up instead";
            status = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<String>(response, status);
    }

    @PutMapping("{userEmail}/{token}")
    public String updateUser(@PathVariable String userEmail, @PathVariable String token, @RequestBody User user){

        if(authenticationService.authenticateUser(userEmail, token)){
            return userService.updateUser(user);
        }else{
            return "Signup first!!";
        }
    }

    @DeleteMapping("delete/{userEmail}")
    public String deleteUser(@PathVariable String userEmail){

        if(userService.findByUserEmail(userEmail)){
            return userService.deleteUser(userEmail);
        }else{
            return "User does not Exist.";
        }
    }
}
