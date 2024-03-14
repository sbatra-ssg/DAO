package com.sopra.DAOAssignment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sopra.repository.FurnitureRepository;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static SessionFactory sf;
	public static Session s;
	
    public static void main( String[] args )
    {
    	
    	Configuration config = new Configuration();
    	
    	config.configure();
    	
    	sf = config.buildSessionFactory();
    	
    	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext();
    	
    	app.scan("com.sopra.repository");
    	
    	app.refresh();
    	
    	
    	s = sf.openSession();
    	
    	FurnitureRepository fur = app.getBean(FurnitureRepository.class);
    	
    	Transaction t = s.beginTransaction();
    	
//    	FurnitureInventory furniture = new FurnitureInventory(1, "Durian", "Chair", 500, 10); 
//    	fur.create(furniture);
//    	
//    	s.persist(furniture);
    	
    	FurnitureInventory f = fur.read(1);
    	
    	System.out.println(f);
    	
    	List<FurnitureInventory> lst = new ArrayList<FurnitureInventory>();
    	
    	lst = fur.readAll();
    	
    	for(FurnitureInventory f1 : lst) {
    		
    		System.out.println(f1);
    	}
    	
    	String res = fur.delete(1);
    	
    	System.out.println(res);
    	
    	t.commit();
    	
    	
    	s.close();
    	
    	sf.close();
    }
}
