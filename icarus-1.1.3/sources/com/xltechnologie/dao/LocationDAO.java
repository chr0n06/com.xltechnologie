/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Location;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author max_p
 */
public class LocationDAO implements Serializable{
    private final SessionFactory sessionFactory;

    public LocationDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    /*CRUD OPS*/
    public void createLocation(Location location) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            session.save(location);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

    }

    public List<Location> getAllLocation() {
        Session session = sessionFactory.openSession();
        List<Location> locations = session.getNamedQuery("selectAllLocation")
                .list();
        session.close();
        return locations;
    }

    public Location getLocationById(Integer id) {
        Session session = sessionFactory.openSession();

        Location foundLocation = (Location) session.createQuery("from Location where id=" + id).uniqueResult();
        session.close();
        return foundLocation;
    }

   
}
