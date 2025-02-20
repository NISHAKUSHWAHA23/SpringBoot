package com.spring.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.main.entities.Student;
import com.spring.main.services.StudentService;
import com.spring.main.services.StudentServiceimpl;

@SpringBootApplication
public class SpringbootWithDataJpa1Application {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(SpringbootWithDataJpa1Application.class, args);
	StudentService stdService=context.getBean(StudentServiceimpl.class);
	
//	insertion-----------------------------------
//	Student std=new Student();
//	std.setName("deepak1");
//	std.setRollno(72);
//	std.setMarks(902.8f);
//	boolean status=stdService.addStudentDetails(std);	
//		if(status) {
//			System.out.println("student inserted successfully:");
//		}
//		else {
//			System.out.println("student not inserted");
//		}
//	
	
	//selectOperation--1---------------------------------
//	List<Student> stdList=stdService.getAllDetails();
//	for(Student std: stdList) {
//		System.out.println("Id :"+std.getId());
//		System.out.println("Name :"+std.getName());
//		System.out.println("Rollno :"+std.getRollno());
//		System.out.println("Marks :"+std.getMarks());
//		System.out.println("--------------------------------------");
//	}
	
	
	Student std=stdService.getstdDetail(1L);
	System.out.println("Id :"+std.getId());
	System.out.println("Name :"+std.getName());
	System.out.println("Rollno :"+std.getRollno());
	System.out.println("Marks :"+std.getMarks());
	
	
	}
		
	

}
