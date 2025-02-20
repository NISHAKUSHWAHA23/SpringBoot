package com.spring.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.main.entities.user;

@SpringBootApplication
public class SpringbootHibernatedb1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootHibernatedb1Application.class, args);
		context
		//user user1=new user();
//    	user1.setId(1);
//    	user1.setName("Nisha");
//    	user1.setEmail("nisha@123");
//    	user1.setPassword("nisha1");
//    	//user1.setGender("female");
//    	user1.setCity("lko");
//    	
////    	user1.setId(2);
////    	user1.setName("Disha");
////    	user1.setEmail("disha@123");
////    	user1.setPassword("disha1");
////    	//user1.setGender("female");
////    	user1.setCity("lko-nr");
////    	
//    	//select from Users-------------------------------------------
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//        Configuration cfg=new Configuration();
//        cfg.configure("/com/spring/main/resources/hibernate.cfg.xml");
//        SessionFactory sessionFactory=cfg.buildSessionFactory();
//        Session session=sessionFactory.openSession();
//        Transaction transaction=session.beginTransaction();
//       // for insertion purpose;
//        try {
//        	session.save(user1);
//        	transaction.commit();
//        	System.out.println("user successfully inserted:");
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        	}
        
        
	}

}
