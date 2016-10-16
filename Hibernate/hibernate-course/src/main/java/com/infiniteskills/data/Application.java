package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.entities.User;

public class Application {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		/*
		session.beginTransaction();
		session.close();*/
		
		session.getTransaction().begin();
		
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedDate(new Date());
		user.setCreatedBy("me");
		user.setEmailAddress("i@g.com");
		user.setFirstName("Roman");
		user.setLastName("Orel");
		user.setLastUpdatedDate(new Date());
		user.setLastUpdatedBy("roman");
		
		session.save(user);
		
		session.getTransaction().commit();// Commit
		session.close();
		
		
	}

}
