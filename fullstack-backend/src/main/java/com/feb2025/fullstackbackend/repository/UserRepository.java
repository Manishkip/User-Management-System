package com.feb2025.fullstackbackend.repository;

import com.feb2025.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
