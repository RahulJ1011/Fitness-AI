package com.fitness.userService.repository;

import com.fitness.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,String>
{
    public boolean existsByEmail(String Email);
}
