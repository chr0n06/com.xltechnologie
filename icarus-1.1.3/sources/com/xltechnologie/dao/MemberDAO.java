/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.xltechnologie.controller.utils.EncryptionException;
import com.xltechnologie.controller.utils.EncryptionUtils;
import com.xltechnologie.entities.Member;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class MemberDAO implements Serializable {

    private final SessionFactory sessionFactory;

    public MemberDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public Member getMemberByMemberEmailAndPassword(String email, String password) {
        Session session = sessionFactory.openSession();

        String encryptPassword="";
        try {
            encryptPassword = (new EncryptionUtils()).encrypt(password);
        } catch (EncryptionException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        Member member = (Member) session.getNamedQuery("findMemberByEmailAndPassword")
                .setString("email", email)
                .setString("password", encryptPassword)
                .uniqueResult();
        session.close();
        return member;
    }

   public void saveMember(Member connectedMember) {

        Session session = sessionFactory.openSession();
        session.merge(connectedMember);
        session.flush();
        session.close();
    }

   public Member getMemberById(Integer id) {
        Session session = sessionFactory.openSession();
        Member foundMember = (Member) session.createQuery("from Member where id="+id).uniqueResult();

        session.close();
        return foundMember;
    }
   
}
