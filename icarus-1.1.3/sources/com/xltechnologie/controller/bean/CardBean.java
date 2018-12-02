/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.dao.CardDAO;
import com.xltechnologie.entities.Card;
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
 * @author max_p
 */
@ManagedBean(name = "cardBean")
@ViewScoped

public class CardBean {

    /**
     * Creates a new instance of CardBean
     */
    private long id;
    private String type;
    private String number;
    private long accountId;
    private long memberId;
    private long interestRateId;
    private String expiration;
    
    private CardDAO cardDAO;

    @PostConstruct
    public void init() {
        cardDAO = new CardDAO();
    }

    public List<String> findAllCards(String query) {
        List<String> cardsToString = new ArrayList<String>();
        List<Card> cards = cardDAO.getAllCard();
       
        cards.forEach((card) -> {
            cardsToString.add(query + card.getNumber());
        });   
        return cardsToString;
    }
    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", event.getObject().toString()));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public long getInterestRateId() {
        return interestRateId;
    }

    public void setInterestRateId(long interestRateId) {
        this.interestRateId = interestRateId;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public CardDAO getCardDAO() {
        return cardDAO;
    }

    public void setCardDAO(CardDAO cardDAO) {
        this.cardDAO = cardDAO;
    }
    
}
