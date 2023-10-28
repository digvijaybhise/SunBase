package com.SunBase.SunBase_Internshala.repository;

import com.SunBase.SunBase_Internshala.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepository extends JpaRepository<AuthenticationToken, Integer> {

    public AuthenticationToken findByToken(String token);

    public AuthenticationToken findByUserUserId(Integer id);
}
