package com.javaaces.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaaces.hibernate.Address;
import com.javaaces.hibernate.Emp;

public class TestHibApp {
	public static void main(String[] args) {
		
			Session session = HibernateUtil.getSessionFactory().openSession(); 
		    Transaction tran = session.beginTransaction();
		    
		    Emp e1 = new Emp();  
		    e1.setId(1001);  
		    e1.setName("Leonel");  
		    e1.setAge(30); 
		    
		    Address addr  =  new Address();
		    addr.setStreet("678 Holly West Rd.");
		    addr.setState("Georgia");
		    addr.setZip("30126");
		    addr.setEmail("thy@yahoo.com");
		    e1.setHomeAddress(addr);
		    
		    Address addr2  =  new Address();
		    addr2.setStreet("100 Ran Rd. ");
		    addr2.setState("Georgia");
		    addr2.setZip("30318");
		    addr2.setEmail("abc@gmail.com");
		    e1.setOfficeAddress(addr2);
		    
		 
		    session.save(e1);
		    
		    tran.commit();  
		    
		    //print data into eclipse
		    e1 = null;
		    
		    session.beginTransaction();
		    e1 = (Emp) session.get(Emp.class, 1001);
		    System.out.println("The user name is: " + e1.getName()+"\n" +"The user age is: " + e1.getAge()+ "\n");
		    System.out.println("The persons Home and Office address is = " + e1.getHomeAddress()+ "\n" + e1.getOfficeAddress());
		    
		    session.close(); 
		    System.out.println("\n" + "Record saved into Database"); 
		    
	}

}
