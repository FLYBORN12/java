/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Maquinas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf
 */
@Local
public interface MaquinasFacadeLocal {

    void create(Maquinas maquinas);

    void edit(Maquinas maquinas);

    void remove(Maquinas maquinas);

    Maquinas find(Object id);

    List<Maquinas> findAll();

    List<Maquinas> findRange(int[] range);

    int count();
    
}
