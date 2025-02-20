package com.spring.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student ,Long>
{
	
}
