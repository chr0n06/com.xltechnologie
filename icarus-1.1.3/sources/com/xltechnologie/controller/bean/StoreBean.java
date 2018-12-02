/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.dao.StoreDAO;
import com.xltechnologie.entities.Store;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author max_p
 */
@ManagedBean(name = "storeBean")
@ViewScoped
public class StoreBean {

    private int id;
    private String name;
    private String phone;
    
    private StoreDAO storeDAO;

    @PostConstruct
    public void init() {
        storeDAO = new StoreDAO();
    }

    public List<String> findAllStores(String query) {
        List<String> storesToString = new ArrayList<String>();
        List<Store> stores = storeDAO.getAllStore();
       
        stores.forEach((store) -> {
            storesToString.add(query + store.getName());
        });   
        return storesToString;
    }
    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", event.getObject().toString()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public StoreDAO getStoreDAO() {
        return storeDAO;
    }

    public void setStoreDAO(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }
    
    
    
}
