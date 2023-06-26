package com.masai.answer4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("eval1_connection");
	}
	
	
    public static void main( String[] args )
    {
    	EntityManager em=emf.createEntityManager();
        System.out.println( "Hello World!" );
    }
}
