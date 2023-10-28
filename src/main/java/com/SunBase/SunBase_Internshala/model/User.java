package com.SunBase.SunBase_Internshala.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

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

    public User(String userFirstName, String userLastName, String userStreet, String userAddress, String userCity, String userState, String userPhoneNumber, String userEmail, String userPassword) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userStreet = userStreet;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userState = userState;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
}
