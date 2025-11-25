package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataProvider {

    private static SessionFactory sessionFactory = null;

    private DataProvider() {};

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            var configuracion = new Configuration().configure();
            /*configuracion.setProperty("hibernate.connection.username",System.getenv("DB_USER"));
            configuracion.setProperty("hibernate.connection.password",System.getenv("DB_PASSWORD"));*/
            sessionFactory = configuracion.buildSessionFactory();
        }
        return sessionFactory;
    }

}
