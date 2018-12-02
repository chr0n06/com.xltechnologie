package com.xltechnologie.entities;
// Generated 2018-11-05 17:37:51 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * Member generated by hbm2java
 */
@Entity
@Table(name = "member",
        catalog = "dbo"
)

@NamedQueries({
    @NamedQuery(
            name = "findMemberByEmailAndPassword",
            query = "from Member m where m.email = :email and m.password=:password"
    )
})
 
public class Member implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String password;

    /*
    @ManyToMany
    @JoinTable(
            name = "MemberAccount",
            joinColumns = {
                @JoinColumn(name = "MemberID")},
            inverseJoinColumns = {
                @JoinColumn(name = "AccountID")}
    )
    private Set<Account> accounts = new HashSet<>();
     */
    public Member() {
    }

    public Member(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + '}';
    }

    
}