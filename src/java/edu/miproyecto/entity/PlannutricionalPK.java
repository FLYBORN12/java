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
import javax.validation.constraints.Size;

/**
 *
 * @author juanf
 */
@Embeddable
public class PlannutricionalPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Timefood_idTimefood")
    private String timefoodidTimefood;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Dia_idDia")
    private String diaidDia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_idCliente")
    private int clienteidCliente;

    public PlannutricionalPK() {
    }

    public PlannutricionalPK(String timefoodidTimefood, String diaidDia, int clienteidCliente) {
        this.timefoodidTimefood = timefoodidTimefood;
        this.diaidDia = diaidDia;
        this.clienteidCliente = clienteidCliente;
    }

    public String getTimefoodidTimefood() {
        return timefoodidTimefood;
    }

    public void setTimefoodidTimefood(String timefoodidTimefood) {
        this.timefoodidTimefood = timefoodidTimefood;
    }

    public String getDiaidDia() {
        return diaidDia;
    }

    public void setDiaidDia(String diaidDia) {
        this.diaidDia = diaidDia;
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
        hash += (timefoodidTimefood != null ? timefoodidTimefood.hashCode() : 0);
        hash += (diaidDia != null ? diaidDia.hashCode() : 0);
        hash += (int) clienteidCliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlannutricionalPK)) {
            return false;
        }
        PlannutricionalPK other = (PlannutricionalPK) object;
        if ((this.timefoodidTimefood == null && other.timefoodidTimefood != null) || (this.timefoodidTimefood != null && !this.timefoodidTimefood.equals(other.timefoodidTimefood))) {
            return false;
        }
        if ((this.diaidDia == null && other.diaidDia != null) || (this.diaidDia != null && !this.diaidDia.equals(other.diaidDia))) {
            return false;
        }
        if (this.clienteidCliente != other.clienteidCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.PlannutricionalPK[ timefoodidTimefood=" + timefoodidTimefood + ", diaidDia=" + diaidDia + ", clienteidCliente=" + clienteidCliente + " ]";
    }
    
}
