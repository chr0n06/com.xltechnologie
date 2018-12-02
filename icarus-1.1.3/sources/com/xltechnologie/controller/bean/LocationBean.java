/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.dao.LocationDAO;
import com.xltechnologie.entities.Location;
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
@ManagedBean(name = "locationBean")
@ViewScoped

public class LocationBean {

    private int id;
    private String city;
    private LocationDAO locationDAO;
    /**
     * Creates a new instance of LocationBean
     */
     @PostConstruct
    public void init() {
        locationDAO = new LocationDAO();
    }
    
    public List<String> findAllLocations(String query) {
        List<String> locationsToString = new ArrayList<String>();
        List<Location> locations = locationDAO.getAllLocation();
       
        locations.forEach((location) -> {
            locationsToString.add(query + location.getCity());
        });   
        return locationsToString;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocationDAO getLocationDAO() {
        return locationDAO;
    }

    public void setLocationDAO(LocationDAO locationDAO) {
        this.locationDAO = locationDAO;
    }
    
    
}
