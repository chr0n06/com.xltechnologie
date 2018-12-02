/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.utils;

/**
 *
 * @author Maxime
 */
public class Queries {
    public static final String SELECT_ALL_CATEGORIES_BY_STORE_ID = ""
            + "SELECT c.id,c.name FROM store_category sc "
            + "INNER JOIN store s ON sc.store_id = s.id "
            + "INNER Join category c ON sc.category_id = c.id "
            + "WHERE sc.store_id = :id";
}
