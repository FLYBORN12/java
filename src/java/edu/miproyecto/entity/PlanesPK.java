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
public class PlanesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idplanes")
    private int idplanes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_idCliente")
    private int clienteidCliente;

    public PlanesPK() {
    }

    public PlanesPK(int idplanes, int clienteidCliente) {
        this.idplanes = idplanes;
        this.clienteidCliente = clienteidCliente;
    }

    public int getIdplanes() {
        return idplanes;
    }

    public void setIdplanes(int idplanes) {
        this.idplanes = idplanes;
    }

    public int getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(int clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idplanes;
        hash += (int) clienteidCliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanesPK)) {
            return false;
        }
        PlanesPK other = (PlanesPK) object;
        if (this.idplanes != other.idplanes) {
            return false;
        }
        if (this.clienteidCliente != other.clienteidCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.PlanesPK[ idplanes=" + idplanes + ", clienteidCliente=" + clienteidCliente + " ]";
    }
    
}
