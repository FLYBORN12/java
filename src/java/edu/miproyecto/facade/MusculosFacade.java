/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Musculos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juanf
 */
@Stateless
public class MusculosFacade extends AbstractFacade<Musculos> implements MusculosFacadeLocal {

    @PersistenceContext(unitName = "miproyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MusculosFacade() {
        super(Musculos.class);
    }
    
}
