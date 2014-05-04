package playlibrary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BaseHibernateDao
 */
public class BaseHibernateDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        try {
            return sessionFactory.getCurrentSession();
        } catch (Exception e) {
             return sessionFactory.openSession();
        }
    }


}
