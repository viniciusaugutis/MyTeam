package Util;


import Model.Cidade;
import Model.Arbitro;
import Model.Time;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
public class HibernateUtil {
    private static SessionFactory factory;
    static {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        Set<String> stringPropertyNames = cfg.getProperties().stringPropertyNames();
        cfg.addAnnotatedClass(Cidade.class);
        cfg.addAnnotatedClass(Arbitro.class);
        cfg.addAnnotatedClass(Time.class);
        factory = cfg.buildSessionFactory();
    }
    public static Session getSession() {
        return factory.openSession();
    }
}