/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.dao.InvoiceDAO;
import com.xltechnologie.dao.MemberDAO;
import com.xltechnologie.entities.Invoice;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author max_p
 */
@Named(value = "insertInvoiceBean")
@Dependent
public class insertInvoiceBean implements Serializable {

    private Date date;
    String store;
    String location;
    String detail;
    String category;
    String project;
    BigDecimal total;
    boolean copy;
    String card;
    boolean paid;

    private InvoiceDAO invoiceDAO;

    @PostConstruct
    public void init() {
        invoiceDAO = new InvoiceDAO();
    }
/*
    public void insertInvoice() {
        invoiceDAO.createInvoice();

    }
*/
}
