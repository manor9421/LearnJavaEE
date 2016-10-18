package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infiniteskills.data.entities.Bond;

public class ITry {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		Bond b = new Bond();
		
		b.setName("Roman");
		b.setIssuer("Abc");
		b.setPurchaseDate(new Date());
		b.setValue(10.2);
		b.setInterestRate(2);
		b.setMarurityDate(new Date());
		b.setPortfolioID(2L);
		
		session.save(b);
		
		t.commit();
		
	}
}
