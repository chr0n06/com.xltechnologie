/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Category;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author max_p
 */
public class CategoryDAOTest {
    
    public CategoryDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createCategory method, of class CategoryDAO.
     */
    @Test
    public void testCreateCategory() {
        System.out.println("createCategory");
        Category category = null;
        CategoryDAO instance = new CategoryDAO();
        instance.createCategory(category);
        
    }

    /**
     * Test of getAllCategory method, of class CategoryDAO.
     */
    @Test
    public void testGetAllCategory() {
        System.out.println("getAllCategory");
        CategoryDAO instance = new CategoryDAO();
        List<Category> result = instance.getAllCategory();
        assertNotNull(result);
    }

    /**
     * Test of getCategoryById method, of class CategoryDAO.
     */
    @Test
    public void testGetCategoryById() {
        System.out.println("getCategoryById");
        Integer id = 1;
        CategoryDAO instance = new CategoryDAO();
        Category expResult = null;
        Category result = instance.getCategoryById(id);
        assertNotEquals(expResult, result);
   
    }

    /**
     * Test of updateCategory method, of class CategoryDAO.
     */
    /*@Test
    public void testUpdateCategory() {
        System.out.println("updateCategory");
        Long id = null;
        String name = "";
        CategoryDAO instance = new CategoryDAO();
        instance.updateCategory(id, name);
 
    }*/

    /**
     * Test of deleteCategory method, of class CategoryDAO.
     */
    /*@Test
    public void testDeleteCategory() {
        System.out.println("deleteCategory");
        Category category = null;
        CategoryDAO instance = new CategoryDAO();
        instance.deleteCategory(category);

    }*/
}
