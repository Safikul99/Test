package com.OneToOne2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class, 1);
		 if(person!=null)
		 {
		PanCard panCard=entityManager.find(PanCard.class, 1);
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(panCard);
		entityTransaction.commit();
		 }
		 else
		 {
			 System.out.println("data allredy delete");
		 }

	}

}
