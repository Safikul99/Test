package com.OneToOne2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpDateData {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,1);
		person.setAge(40);
		
		PanCard panCard =entityManager.find(PanCard.class, 1);
		panCard.setState("Kerala");
		
		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(panCard);
		entityTransaction.commit();
		

	}

}
