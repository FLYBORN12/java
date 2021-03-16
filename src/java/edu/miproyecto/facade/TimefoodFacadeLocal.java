/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Timefood;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf
 */
@Local
public interface TimefoodFacadeLocal {

    void create(Timefood timefood);

    void edit(Timefood timefood);

    void remove(Timefood timefood);

    Timefood find(Object id);

    List<Timefood> findAll();

    List<Timefood> findRange(int[] range);

    int count();
    
}
