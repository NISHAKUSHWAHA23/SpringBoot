package com.spring.main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootProject1Application implements CommandLineRunner
{

	public static void main(String[] args) {
		System.out.print("hello for hi");
		SpringApplication.run(SpringbootProject1Application.class, args);
		System.out.print("hello FOR BYE springBoot: ");
	}

	@Override
	public void run(String... args) throws Exception {
		myclass().myName("Nisha");
		
	}

    @Bean
   public Myclass myclass(){
		return new Myclass();
	}
	

}
