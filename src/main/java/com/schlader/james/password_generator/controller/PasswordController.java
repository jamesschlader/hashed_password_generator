package com.schlader.james.password_generator.controller;

import com.schlader.james.password_generator.DTO.HashedPasswordDTO;
import com.schlader.james.password_generator.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    @PostMapping("/gethashedpassword")
    public HashedPasswordDTO getHashedPassword(@RequestBody String word){
        return passwordService.getHashedPassword(word);
    }
}
