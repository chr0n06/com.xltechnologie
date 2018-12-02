/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xltechnologie.controller.utils;

import com.xltechnologie.entities.Member;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


/**
 *
 */
public class SessionUtils implements Serializable {

    public static HttpSession getSession() {
        return (HttpSession) FacesContext.
                getCurrentInstance().
                getExternalContext().
                getSession(false);
    }

    public static Member getConnectedMember() {
        return (Member) getSession().getAttribute("member");
    }

    public static void setConnectedMember(Member connectedMember) {
        getSession().setAttribute("member", connectedMember);
    }
}
