package com.SunBase.SunBase_Internshala.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignInInput {

    private String userEmail;
    private String userPassword;
}
