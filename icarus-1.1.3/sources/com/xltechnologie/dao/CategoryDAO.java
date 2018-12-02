/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.controller.utils.Queries;
import com.xltechnologie.entities.Category;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Maxime
 */
public class CategoryDAO implements Serializable {

    private final SessionFactory sessionFactory;

    public CategoryDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    /*CRUD OPS*/
    public void createCategory(Category category) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            session.save(category);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

    }

    public List<Category> getAllCategory() {
        Session session = sessionFactory.openSession();
        List<Category> categories = session.getNamedQuery("selectAllCategory")
                .list();
        session.close();
        return categories;
    }

    public Category getCategoryById(Integer id) {
        Session session = sessionFactory.openSession();

        Category foundCategory = (Category) session.createQuery("from Category where id=" + id).uniqueResult();
        session.close();
        return foundCategory;
    }

    public void updateCategory(Long id, String name) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Category category = (Category) session.get(Category.class, id);
        category.setName(name);
        session.getTransaction().commit();
    }

    public void deleteCategory(Category category) {
        Session session = sessionFactory.openSession();

        session.createSQLQuery("delete from category where id=" + category.getId()).executeUpdate();

        session.delete(category);
        session.flush();
        session.close();

    }
    
    public List<Category> getAllCategoriesByStoreID(Long id) {
        Session session = sessionFactory.openSession();
                SQLQuery query = session.createSQLQuery(Queries.SELECT_ALL_CATEGORIES_BY_STORE_ID);
                query.setParameter("id", id);
                query.addEntity(Category.class);
                List<Category> categories = query.list();
        session.close();
        return categories;
    }
    
    public Set<Category> getAllCategoriesByStoreIDSet(Long id) {
        Session session = sessionFactory.openSession();
                SQLQuery query = session.createSQLQuery(Queries.SELECT_ALL_CATEGORIES_BY_STORE_ID);
                query.setParameter("id", id);
                query.addEntity(Category.class);
                Set<Category> categories = (Set<Category>) query.list();
        session.close();
        return categories;
    }

}
