package com.CRUDexample.springbootrestfulwebservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUDexample.springbootrestfulwebservices.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}