package com.OneToOne2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GatData {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Person e");
		List<Person> persons=query.getResultList();
		
		Query query1=entityManager.createQuery("select e from PanCard e");
		List<PanCard> panCard=query1.getResultList();
		
		for (PanCard panCard2 : panCard) 
		{
			System.out.println("Pan Id:"+panCard2.getPid());
			System.out.println("Pan Pno:"+panCard2.getPno());
			System.out.println("Pan State:"+panCard2.getState());
			System.out.println("Pan Country:"+panCard2.getCountry());
			System.out.println("========================================");

		}
		
		for (Person person : persons) 
		{
			System.out.println("Person Id:"+person.getId());
			System.out.println("Person Name:"+person.getName());
			System.out.println("Person Age:"+person.getAge());
			System.out.println("Person Phno:"+person.getPhno());
			System.out.println("Person Gender:"+person.getGender());
			System.out.println("Person Email:"+person.getEmail());
			System.out.println("====================================");
			
		}


	}

}
