package com.spring.main.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public static SessionFactory getSessionFactory() {
		

        Configuration cfg=new Configuration();
        cfg.configure("/com/spring/main/resources/hibernate.cfg.xml");
        
		return cfg.buildSessionFactory();
		
	}
}
