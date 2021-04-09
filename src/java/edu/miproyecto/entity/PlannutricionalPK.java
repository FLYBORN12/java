/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author juanf
 */
@Embeddable
public class PlannutricionalPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idplanNutricional")
    private int idplanNutricional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_id")
    private int clienteId;

    public PlannutricionalPK() {
    }

    public PlannutricionalPK(int idplanNutricional, int clienteId) {
        this.idplanNutricional = idplanNutricional;
        this.clienteId = clienteId;
    }

    public int getIdplanNutricional() {
        return idplanNutricional;
    }

    public void setIdplanNutricional(int idplanNutricional) {
        this.idplanNutricional = idplanNutricional;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idplanNutricional;
        hash += (int) clienteId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlannutricionalPK)) {
            return false;
        }
        PlannutricionalPK other = (PlannutricionalPK) object;
        if (this.idplanNutricional != other.idplanNutricional) {
            return false;
        }
        if (this.clienteId != other.clienteId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.PlannutricionalPK[ idplanNutricional=" + idplanNutricional + ", clienteId=" + clienteId + " ]";
    }
    
}
