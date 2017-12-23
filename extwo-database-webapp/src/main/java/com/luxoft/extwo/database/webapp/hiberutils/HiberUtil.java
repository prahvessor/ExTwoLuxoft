package com.luxoft.extwo.database.webapp.hiberutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
    private static SessionFactory sessionFactory = null;

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
