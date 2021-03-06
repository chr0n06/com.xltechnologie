package com.xltechnologie.entities;
// Generated 2018-11-05 17:37:51 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Spending generated by hbm2java
 */
@Entity
@Table(name = "invoice",
        catalog = "dbo"
)

public class Invoice implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "card")
    private Card card;
    @Column(name = "project")
    private Project project;
    @Column(name = "store")
    private Store store;
    @Column(name = "date")
    private Date date;
    @Column(name = "detail")
    private String detail;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "copy")
    private Boolean copy;
    @Column(name = "paid")
    private Boolean paid;

    public Invoice() {
    }

    public Invoice(Card card, Project project, Store store, Date date, String detail, BigDecimal total, Boolean copy, Boolean paid) {
        this.card = card;
        this.project = project;
        this.store = store;
        this.date = date;
        this.detail = detail;
        this.total = total;
        this.copy = copy;
        this.paid = paid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getCopy() {
        return copy;
    }

    public void setCopy(Boolean copy) {
        this.copy = copy;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", card=" + card + ", project=" + project + ", store=" + store + ", date=" + date + ", detail=" + detail + ", total=" + total + ", copy=" + copy + ", paid=" + paid + '}';
    }




   
}
