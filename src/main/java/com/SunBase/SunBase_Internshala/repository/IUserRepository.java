package com.SunBase.SunBase_Internshala.repository;

import com.SunBase.SunBase_Internshala.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

    public boolean existsByUserEmail(String userEmail);

    public User findByUserEmail(String userEmail);
}
