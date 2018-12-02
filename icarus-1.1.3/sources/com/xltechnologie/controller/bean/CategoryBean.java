/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.dao.CategoryDAO;
import com.xltechnologie.entities.Category;
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
 * @author Maxime
 */
@ManagedBean(name = "categoryBean")
@ViewScoped

public class CategoryBean {

    private int id;
    private String name;

    private CategoryDAO categoryDAO;

    @PostConstruct
    public void init() {
        categoryDAO = new CategoryDAO();
    }

    public List<String> findAllCategories(String query) {
        List<String> categoriesToString = new ArrayList<String>();
        List<Category> categories = categoryDAO.getAllCategory();
       
        categories.forEach((category) -> {
            categoriesToString.add(query + category.getName());
        });   
        return categoriesToString;
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

    public CategoryDAO getCategoryDAO() {
        return categoryDAO;
    }

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

}
