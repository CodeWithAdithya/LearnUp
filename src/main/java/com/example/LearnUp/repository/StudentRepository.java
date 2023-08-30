package com.example.LearnUp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LearnUp.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{

}
