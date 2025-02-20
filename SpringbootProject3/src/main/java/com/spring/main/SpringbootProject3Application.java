package com.spring.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.main.beans.Student;

@SpringBootApplication
public class SpringbootProject3Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		stdBean1().displayDetails();
		stdBean2().displayDetails();
		
		
	}
	@Bean
	public Student stdBean1() {
		return new Student("Nishu",1,56.7f);
	}
	@Bean
	public Student stdBean2() {
		return new Student("Nisha",1,56.7f);
	}
	

}
