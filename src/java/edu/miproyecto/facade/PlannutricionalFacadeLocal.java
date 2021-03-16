/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Plannutricional;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf
 */
@Local
public interface PlannutricionalFacadeLocal {

    void create(Plannutricional plannutricional);

    void edit(Plannutricional plannutricional);

    void remove(Plannutricional plannutricional);

    Plannutricional find(Object id);

    List<Plannutricional> findAll();

    List<Plannutricional> findRange(int[] range);

    int count();
    
}
