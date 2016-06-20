package com.java.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.java.hibernate.IncomingOrder;
import com.java.hibernate.Orders;
import com.javaaces.hibernate.test.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 
	    Transaction tran = session.beginTransaction();
	    
	    Orders user = new Orders();    
	    user.setName("Leonel Hernandez");  
	    user.setPhoneNumber("678-765-9820");
	    user.setEmail("thy@hotmail.com"); 
	    
	    IncomingOrder order1 = new IncomingOrder();
	    order1.setNameOfProduct("Ipad Mini 3");
	    order1.setAddress("123 Riverdale pky.");
	    order1.setQuantity(1);
	    order1.setPhoneN("404-564-8764");
	    
	    IncomingOrder order2 = new IncomingOrder();
	    order2.setNameOfProduct("Iphone 6");
	    order2.setAddress("786 Magan St.");
	    order2.setQuantity(3);
	    order2.setPhoneN("800-346-87325");
	    
	    user.getListOfOrders().add(order1);
	    user.getListOfOrders().add(order2);
	    
	    
	 
	    session.save(user);
	    
	    tran.commit();  
	    
	    //print data into eclipse
	    user = null;
	    
	    session.beginTransaction();
	    user = (Orders) session.get(Orders.class, 1);
	    System.out.println("\n" + "The user info is: " + user.getName()+ "\n" + user.getPhoneNumber()+ "\n"+ user.getEmail() +"\n");
	    System.out.println("The Customer ordered: " + user.getListOfOrders());
	    
	    session.close(); 
	    System.out.println("\n" + "Record saved into Database"); 
	    
}
}
