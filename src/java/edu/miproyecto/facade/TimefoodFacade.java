/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Timefood;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juanf
 */
@Stateless
public class TimefoodFacade extends AbstractFacade<Timefood> implements TimefoodFacadeLocal {

    @PersistenceContext(unitName = "miproyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TimefoodFacade() {
        super(Timefood.class);
    }
    
}
