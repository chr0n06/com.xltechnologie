/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.dao;

import com.xltechnologie.entities.Store;
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
public class StoreDAOTest {
    
    public StoreDAOTest() {
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
     * Test of getAllStore method, of class StoreDAO.
     */
    @Test
    public void testGetAllStore() {
        System.out.println("getAllStore");
        StoreDAO instance = new StoreDAO();
        List<Store> expResult = null;
        List<Store> result = instance.getAllStore();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStoreById method, of class StoreDAO.
     */
    @Test
    public void testGetStoreById() {
        System.out.println("getStoreById");
        Integer id = null;
        StoreDAO instance = new StoreDAO();
        Store expResult = null;
        Store result = instance.getStoreById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
