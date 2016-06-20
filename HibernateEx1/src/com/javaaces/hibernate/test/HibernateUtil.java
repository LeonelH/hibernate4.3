package com.javaaces.hibernate.test;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();;
    private static ServiceRegistry serviceRegistry;

    private static  SessionFactory buildSessionFactory() {
		try {
			String configXmlPath = "hibernate.cfg.xml";
			Configuration configuration = new Configuration().configure(configXmlPath);

			 serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties())
	                    .build();

	            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		} catch (Exception ex) {
			
			System.out.println("Hibernate exception in sessionFactory"+ ex);
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}
