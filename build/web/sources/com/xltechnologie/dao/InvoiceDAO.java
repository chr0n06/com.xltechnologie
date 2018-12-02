/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Invoice;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Maxime
 */
public class InvoiceDAO implements Serializable{
    
    private final SessionFactory sessionFactory;

    public InvoiceDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    /*CRUD OPS*/
    public void createInvoice(Invoice invoice) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            session.save(invoice);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

    }
    
}
