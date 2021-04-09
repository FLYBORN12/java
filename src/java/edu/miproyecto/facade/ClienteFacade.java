/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author juanf
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {

    @PersistenceContext(unitName = "miproyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
       public Cliente verificacion(String correoin, String clavein) {
        try {

            Query consulta = em.createQuery("SELECT c FROM Cliente c WHERE c.contrasenia = :clavein AND c.correo = :correoin");
            consulta.setParameter("clavein", clavein);
            consulta.setParameter("correoin", correoin);
            return (Cliente) consulta.getSingleResult();

        } catch (Exception e) {
            System.out.println("El error en la validacion " + e.getMessage());
            return new Cliente();
        }
    }  
    
    public Cliente getCorreo(String correoin){
        try{
            Query peticion = em.createQuery("SELECT c FROM Cliente c WHERE c.correo = :correoin");
            peticion.setParameter("correoin",correoin);
            return (Cliente) peticion.getSingleResult();
        }catch(Exception e){
            System.out.println("El error el Usuario por correo es : " + e.getMessage());
            return new Cliente();
        }
    }
}
