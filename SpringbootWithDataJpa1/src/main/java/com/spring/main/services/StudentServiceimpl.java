package com.spring.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.entities.Student;
import com.spring.main.repositories.StudentRepository;
@Service
public class StudentServiceimpl implements StudentService
{
	@Autowired
		private StudentRepository studentRes;

	@Override
	public boolean addStudentDetails(Student std) {
		
		boolean status=false;
		try {
			studentRes.save(std);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
		
		
	}
	//-----------------------------------------

	@Override
	public List<Student> getAllDetails() {
		
		return studentRes.findAll();
	}

	@Override
	public Student getstdDetail(long id) {
		
		Optional<Student>optional=studentRes.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
		
		
	}

}
