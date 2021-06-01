package com.example.manytoone.repository;

import com.example.manytoone.model.UsersLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersLogRepository extends JpaRepository<UsersLog, Integer> {
}
