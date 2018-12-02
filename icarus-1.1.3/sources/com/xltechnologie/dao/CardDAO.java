/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Card;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author max_p
 */
public class CardDAO implements Serializable{
     private final SessionFactory sessionFactory;

    public CardDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    public List<Card> getAllCard() {
        Session session = sessionFactory.openSession();
        List<Card> cards = session.getNamedQuery("selectAllCard")
                .list();
        session.close();
        return cards;
    }
    
}
