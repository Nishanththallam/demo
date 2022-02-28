package com.lti.jpademo.demo5jpabasics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserApp {
	public static void main(String[] args) {
		Student s1=new Student(105,"jajyyy",90);
		System.out.println(s1);
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=factory.createEntityManager();
	
	/*
	 * em.getTransaction().begin(); em.persist(s1); em.getTransaction().commit();
	 */
	
	Student tempStu =em.find(Student.class, 103);
	System.out.println(tempStu);
	
	}

}
