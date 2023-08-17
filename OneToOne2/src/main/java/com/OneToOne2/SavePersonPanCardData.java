package com.OneToOne2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPanCardData {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("safikul");
		person.setAge(22);
		person.setGender("male");
		person.setEmail("safikuli343@gmail.com");
		person.setPhno(8240030196l);
		
		Person person1=new Person();
		person1.setName("somu");
		person1.setAge(20);
		person1.setGender("male");
		person1.setEmail("somu967@gmail.com");
		person1.setPhno(8479003604l);
		
		Person person2=new Person();
		person2.setName("archana");
		person2.setAge(22);
		person2.setGender("female");
		person2.setEmail("archana674@gmail.com");
		person2.setPhno(8740030187l);
		
		PanCard panCard=new PanCard();
		panCard.setPno("AFGPI1214P");
		panCard.setState("WestBangel");
		panCard.setCountry("India");
		
		PanCard panCard1=new PanCard();
		panCard1.setPno("BFGPI1215P");
		panCard1.setState("UttarPradesh");
		panCard1.setCountry("India");
		
		PanCard panCard2=new PanCard();
		panCard2.setPno("HFGPI1217P");
		panCard2.setState("Karnataka");
		panCard2.setCountry("India");
		
		person.setPancard(panCard);
		person1.setPancard(panCard1);
		person2.setPancard(panCard2);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(panCard);
		entityManager.persist(panCard1);
		entityManager.persist(panCard2);
		entityTransaction.commit();
		
		
		



	}

}
