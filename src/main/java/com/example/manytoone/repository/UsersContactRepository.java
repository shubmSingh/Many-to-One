package com.example.manytoone.repository;

import com.example.manytoone.model.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}
