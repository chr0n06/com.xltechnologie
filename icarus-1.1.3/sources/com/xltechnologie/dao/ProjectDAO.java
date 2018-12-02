/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Category;
import com.xltechnologie.entities.Project;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author max_p
 */
public class ProjectDAO implements Serializable{
    private final SessionFactory sessionFactory;

    public ProjectDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
     
    public List<Project> getAllProject() {
        Session session = sessionFactory.openSession();
        List<Project> projects = session.getNamedQuery("selectAllProject")
                .list();
        session.close();
        return projects;
    }
    
}
