/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Planes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juanf
 */
@Stateless
public class PlanesFacade extends AbstractFacade<Planes> implements PlanesFacadeLocal {

    @PersistenceContext(unitName = "miproyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanesFacade() {
        super(Planes.class);
    }
    
}
