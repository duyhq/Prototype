/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.hibernate.datamodel.dao;

import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author duyhq
 */
public class HibernateHelper {

    private static final SessionFactory sessionFactory;
    private static final ThreadLocal<Session> session = new ThreadLocal<>();
   
    static {
        try {
            // Create the SessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            throw new RuntimeException("Hibernate Configuration problem: " + ex.getMessage(), ex);
        }
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public static Session currentSession() throws HibernateException {
        Session s = (Session) session.get();
        // Open a new Session, if this Thread has none yet
        if (s == null) {
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }
   
    public static void init() throws HibernateException {
        currentSession();
    }


    public static void closeSession() throws HibernateException {
        Session s = (Session) session.get();
        session.set(null);
        if (s != null && s.isOpen())
            s.close();
    }
       
    public static void flush() throws HibernateException {
        HibernateHelper.currentSession().flush();
    }
   
    public static Object load(Class<?> aClass, Serializable compare) throws HibernateException {
        return HibernateHelper.currentSession().load(aClass, compare);
    }
   
    public static void update(Object objectToSave) throws HibernateException {
        HibernateHelper.currentSession().update(objectToSave);
    }   
   
    public static Serializable save(Object objectToSave) throws HibernateException {
        return HibernateHelper.currentSession().save(objectToSave);
    }
   
    public static void saveOrUpdate(Object objectToSave) throws HibernateException {
        HibernateHelper.currentSession().saveOrUpdate(objectToSave);
    }
   
    public static Query createQuery(String aQuery) throws HibernateException {
        return HibernateHelper.currentSession().createQuery(aQuery);
    }


    public static Criteria createCriteria(Class<?> criteriaClass) throws HibernateException {
        return HibernateHelper.currentSession().createCriteria(criteriaClass);
    }
   
    public static void delete(Object toDelete) throws HibernateException {
        HibernateHelper.currentSession().delete(toDelete);
    }
}