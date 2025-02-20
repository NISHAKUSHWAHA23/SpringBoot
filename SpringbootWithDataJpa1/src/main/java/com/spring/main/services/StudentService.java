package com.spring.main.services;

import java.util.List;

import com.spring.main.entities.Student;

public interface StudentService {
	
	
		public boolean addStudentDetails(Student std);
		public List<Student>getAllDetails();
		public Student getstdDetail(long id);
		
		
}
