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
import javax.faces.context.FacesContext;

/**
 *
 * @author max_p
 */
@ManagedBean(name = "memberProfileBean")
@SessionScoped
public class MemberProfileBean implements Serializable {

    Member connectedMember;
    MemberDAO memberDAO;

    @PostConstruct
    public void init() {
        memberDAO = new MemberDAO();
        connectedMember = SessionUtils.getConnectedMember();

    }

    public void saveMember() {
        memberDAO.saveMember(connectedMember);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Les informations de l'utilisateur ont ete modifie avec succes"));
    }

    public Member getConnectedMember() {
        return connectedMember;
    }

    public void setConnectedUser(Member connectedMember) {
        this.connectedMember = connectedMember;
    }

    public String disconnect() {
        SessionUtils.getSession().setAttribute("member", null);
        //SessionUtils.getSession().invalidate();
        return "login.xhtml";
    }

}
