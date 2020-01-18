package com.schlader.james.password_generator.DTO;

import lombok.Data;

@Data
public class HashedPasswordDTO {
    private String hash;

    public HashedPasswordDTO(String word){
        this.hash = word;
    }
}
