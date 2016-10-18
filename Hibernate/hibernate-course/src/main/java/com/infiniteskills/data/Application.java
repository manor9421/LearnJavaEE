package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infiniteskills.data.entities.Address;
import com.infiniteskills.data.entities.Bank;
import com.infiniteskills.data.entities.Credential;
import com.infiniteskills.data.entities.TimeTest;
import com.infiniteskills.data.entities.User;

public class Application {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		/*
		session.beginTransaction();
		session.close();*/
		
		/*session.getTransaction().begin();
		
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
		session.close();*/
		
		/*try {
			session.getTransaction().begin();

			TimeTest test = new TimeTest(new Date());
			session.save(test);
			session.getTransaction().commit();
			
			session.refresh(test);
			
			System.out.println(test.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/
		
		/*try {
			Transaction transaction = session.beginTransaction();
			
			User user = new User();
			Address address = new Address();
			user.setAge(22);
			user.setBirthDate(new Date());
			user.setCreatedBy("Kevin");
			user.setCreatedDate(new Date());
			user.setEmailAddress("kmb3");
			user.setFirstName("kevin");
			user.setLastName("bowersox");
			user.setLastUpdatedBy("kmb");
			user.setLastUpdatedDate(new Date());
			
			address.setAddressLine1("line 1");
			address.setAddressLine2("line2");
			address.setCity("Philadelphia");
			address.setState("PA");
			address.setZipCode("12345");
			 
			user.setAddress(address);
			session.save(user);
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/
		
		/*try {
			Transaction transaction = session.beginTransaction();
			
			Bank bank = new Bank();
			bank.setName("Federal Trust");
			bank.setAddressLine1("33 Wall Street");
			bank.setAddressLine2("Suite 233");
			bank.setCity("New York");
			bank.setState("NY");
			bank.setZipCode("12345");
			bank.setInternational(false);
			bank.setCreatedBy("Kevin");
			bank.setCreatedDate(new Date());
			bank.setLastUpdatedBy("Kevin");
			bank.setLastUpdatedDate(new Date());
			//bank.getContacts().add("Joe");
			//bank.getContacts().add("Mary");
			bank.getContacts().put("MANAGER","Joe");
			bank.getContacts().put("TELLER","Mary");
			session.save(bank);
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/
		
		/*try {
			Transaction transaction = session.beginTransaction();
			
			User user = new User();
		
			Address address = new Address();
			Address address2 = new Address();
			setAddressFields(address);
			setAddressFields2(address2);
			user.getAddress().add(address);
			user.getAddress().add(address2);
			setUserFields(user);

			session.save(user);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/
		
		try {
			Transaction transaction = session.beginTransaction();
			
			User user = new User();
			user.setFirstName("Kevin");
			user.setLastName("Bowersox");
			user.setAge(20);
			user.setBirthDate(new Date());
			user.setCreatedBy("Kevin Bowersox");
			user.setCreatedDate(new Date());
			user.setEmailAddress("kevin.bowersox@navy.mil");
			user.setLastUpdatedDate(new Date());
			user.setLastUpdatedBy("Kevin Bowersox");

			Credential credential = new Credential();
			credential.setPassword("kevinspassword");
			credential.setUsername("kmb385");
			credential.setUser(user);
			
			session.save(credential);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
		
	}
	
	private static void setUserFields(User user) {
		user.setAge(22);
		user.setBirthDate(new Date());
		user.setCreatedBy("kmb");
		user.setCreatedDate(new Date());
		user.setEmailAddress("kmb385");
		user.setFirstName("Kevin");
		user.setLastName("bowersox");
		user.setLastUpdatedBy("kevin");
		user.setLastUpdatedDate(new Date());
	}

	private static void setAddressFields(Address address) {
		address.setAddressLine1("Line 1");
		address.setAddressLine2("Line 2");
		address.setCity("New York");
		address.setState("NY");
		address.setZipCode("12345");
	}

	private static void setAddressFields2(Address address) {
		address.setAddressLine1("Line 3");
		address.setAddressLine2("Line 4");
		address.setCity("Corning");
		address.setState("NY");
		address.setZipCode("12345");
	}

}
