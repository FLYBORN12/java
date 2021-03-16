/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Musculos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf
 */
@Local
public interface MusculosFacadeLocal {

    void create(Musculos musculos);

    void edit(Musculos musculos);

    void remove(Musculos musculos);

    Musculos find(Object id);

    List<Musculos> findAll();

    List<Musculos> findRange(int[] range);

    int count();
    
}
