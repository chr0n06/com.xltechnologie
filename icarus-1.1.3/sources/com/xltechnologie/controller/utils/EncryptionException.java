/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.utils;

/**
 *
 */
public class EncryptionException extends Exception {

    EncryptionException(Exception ex) {
       super(ex);
    }

    @Override
    public String getMessage() {
      return "Encryption problem";
    }
}
