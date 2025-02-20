package com.spring.main.repositories;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.spring.main.config.HibernateConfig;
import com.spring.main.entities.user;
@Repository
public class DbOperationsimpl implements DbOperations
{
	
	user user1=null;

	@Override
	public user getUserDetails(Long id) {
		// TODO Auto-generated method stub
		//try with resources
		try (
				Session session=HibernateConfig.getSessionFactory().openSession();
				)
		{
			user1=session.get(user.class, 1L);
		}
		catch(Exception e) {
			
		}
		return user1;
	}
	

}
