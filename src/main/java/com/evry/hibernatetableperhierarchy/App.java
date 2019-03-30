package com.evry.hibernatetableperhierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Bank bank = new Bank();
		bank.setAccountNo(10001);
		bank.setName("Rakesh");
		bank.setBalance(1000);

		ChildOne c1 = new ChildOne();
		bank.setAccountNo(10002);
		c1.setId(1001);
		c1.setAccountNo(12345);
		c1.setBalance(2000);
		c1.setName("Rajneesh");

		ChildTwo c2 = new ChildTwo();
		
		c1.setId(1002);
		c1.setAccountNo(54321);
		c1.setBalance(3000);
		c1.setName("kuresh");

		session.persist(bank);
		session.persist(c1);
		session.persist(c2);
		t.commit();

		session.close();
		factory.close();
	}
}
