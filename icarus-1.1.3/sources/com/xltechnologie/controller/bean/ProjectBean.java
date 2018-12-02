/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.dao.ProjectDAO;
import com.xltechnologie.entities.Project;
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
@ManagedBean(name = "projectBean")
@ViewScoped

public class ProjectBean {
    private int id;
    private String name;
    
    private ProjectDAO projectDAO;

    @PostConstruct
    public void init() {
        projectDAO = new ProjectDAO();
    }
            
    public List<String> findAllProjects(String query) {
        List<String> projectsToString = new ArrayList<String>();
        List<Project> projects = projectDAO.getAllProject();
       
        projects.forEach((project) -> {
            projectsToString.add(query + project.getName());
        });   
        return projectsToString;
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

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }

    public void setProjectDAO(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }
    
}
