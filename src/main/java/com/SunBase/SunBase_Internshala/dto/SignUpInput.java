package com.SunBase.SunBase_Internshala.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignUpInput {

    @Column(nullable = false)
    private String userFirstName;

    @Column(nullable = false)
    private String userLastName;

    @Column(nullable = false)
    private String userStreet;

    @Column(nullable = false)
    private String userAddress;

    @Column(nullable = false)
    private String userCity;

    @Column(nullable = false)
    private String userState;

    @Column(nullable = false)
    private String userPhoneNumber;

    @Column(nullable = false)
    @Email
    private String userEmail;

    @Column(nullable = false)
    private String userPassword;
}
