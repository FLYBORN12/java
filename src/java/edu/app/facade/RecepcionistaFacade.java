/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.facade;

import edu.app.entities.Recepcionista;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juanf
 */
@Stateless
public class RecepcionistaFacade extends AbstractFacade<Recepcionista> implements RecepcionistaFacadeLocal {

    @PersistenceContext(unitName = "miproyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecepcionistaFacade() {
        super(Recepcionista.class);
    }
    
}
