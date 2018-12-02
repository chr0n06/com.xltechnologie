/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 */
public class RESTUtils {

    public static Gson JSONFactory;

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        JSONFactory = gsonBuilder
                .setPrettyPrinting()
                .create();
    }
    
}
