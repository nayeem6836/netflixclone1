package com.example.moviebackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.example.moviebackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

}

