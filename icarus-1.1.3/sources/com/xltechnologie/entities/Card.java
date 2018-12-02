/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author max_p
 */
@Entity
@Table(name = "card",
        catalog = "dbo"
)
@NamedQueries({
    @NamedQuery(
            name = "selectAllCard",
            query = "from Card crd"
    )
})
public class Card implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "type")
    private String type;
    @Column(name = "number")
    private String number;
    @Column(name = "account_id")
    private long accountId;
    @Column(name = "member_id")
    private long memberId;
    @Column(name = "interest_rate_id")
    private long interestRateId;
    @Column(name = "expiration")
    private String expiration;

    public Card() {
    }

    public Card(String type, String number, long accountId, long memberId, long interestRateId, String expiration) {
        this.type = type;
        this.number = number;
        this.accountId = accountId;
        this.memberId = memberId;
        this.interestRateId = interestRateId;
        this.expiration = expiration;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
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

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", type=" + type + ", number=" + number + ", accountId=" + accountId + ", memberId=" + memberId + ", interestRateId=" + interestRateId + ", expiration=" + expiration + '}';
    }

}
