/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.facade;

import edu.miproyecto.entity.Dia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juanf
 */
@Local
public interface DiaFacadeLocal {

    void create(Dia dia);

    void edit(Dia dia);

    void remove(Dia dia);

    Dia find(Object id);

    List<Dia> findAll();

    List<Dia> findRange(int[] range);

    int count();
    
}
