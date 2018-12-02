/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.bean;

import com.xltechnologie.controller.utils.SessionUtils;
import com.xltechnologie.dao.MemberDAO;
import com.xltechnologie.entities.Member;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author max_p
 */
@ManagedBean(name = "loginBean")
@SessionScoped

public class LoginBean implements Serializable {

    private String email = "maxime.laniel@outlook.com";
    private String password = "Prieure4126";
    
    private MemberDAO memberDAO;

    @PostConstruct
    public void init() {
        memberDAO = new MemberDAO();
    }

    public String login() {
            Member member = memberDAO.getMemberByMemberEmailAndPassword(email, password);
            if (member != null) {
                HttpSession session = SessionUtils.getSession();
                session.setAttribute("member", member);
                return "dashboard?faces-redirect=true";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Login ou Mot de passe incorrect", "Login ou Mot de passe incorrect"));
                return "login";
            }
        }
       
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
