package com.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory sessionFactory = buildEntityManagerFactory();

    private static EntityManagerFactory  buildEntityManagerFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return Persistence.createEntityManagerFactory("persistence-test");
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return sessionFactory;
    }

}
