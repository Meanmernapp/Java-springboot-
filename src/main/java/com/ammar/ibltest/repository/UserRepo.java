package com.ammar.ibltest.repository;

import com.ammar.ibltest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
