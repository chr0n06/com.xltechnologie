/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Category;
import com.xltechnologie.entities.Store;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author max_p
 */
public class StoreDAO implements Serializable {

    private final SessionFactory sessionFactory;

    public StoreDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Store> getAllStore() {
        Session session = sessionFactory.openSession();
        List<Store> stores = session.getNamedQuery("selectAllStore")
                .list();
        session.close();
        return stores;
    }

    public Store getStoreById(Integer id) {
        Session session = sessionFactory.openSession();
        Store foundStore = (Store) session.createQuery("from Store where id=" + id).uniqueResult();

        session.close();
        return foundStore;
    }

    

}
