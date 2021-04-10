/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.controlador;

import edu.app.facade.RutinaFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author juanf
 */
@Named(value = "rutinasyPlan")
@SessionScoped
public class rutinasyPlan implements Serializable {

    @EJB
    RutinaFacadeLocal rutinafacadelocal;
   
    public rutinasyPlan() {
    }
    
    
}
