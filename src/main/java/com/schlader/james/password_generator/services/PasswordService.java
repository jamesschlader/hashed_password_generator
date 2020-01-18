package com.schlader.james.password_generator.services;

import com.schlader.james.password_generator.DTO.HashedPasswordDTO;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    public HashedPasswordDTO getHashedPassword(String word) {
        String salt = BCrypt.gensalt();
        return new HashedPasswordDTO(BCrypt.hashpw(word, salt));
    }
}
