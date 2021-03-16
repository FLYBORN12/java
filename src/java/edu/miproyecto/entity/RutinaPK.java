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
public class RutinaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idejercicios")
    private int idejercicios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_idCliente")
    private int clienteidCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "maquinas_idmaquina")
    private int maquinasIdmaquina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "musculos_idmusculos")
    private int musculosIdmusculos;

    public RutinaPK() {
    }

    public RutinaPK(int idejercicios, int clienteidCliente, int maquinasIdmaquina, int musculosIdmusculos) {
        this.idejercicios = idejercicios;
        this.clienteidCliente = clienteidCliente;
        this.maquinasIdmaquina = maquinasIdmaquina;
        this.musculosIdmusculos = musculosIdmusculos;
    }

    public int getIdejercicios() {
        return idejercicios;
    }

    public void setIdejercicios(int idejercicios) {
        this.idejercicios = idejercicios;
    }

    public int getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(int clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    public int getMaquinasIdmaquina() {
        return maquinasIdmaquina;
    }

    public void setMaquinasIdmaquina(int maquinasIdmaquina) {
        this.maquinasIdmaquina = maquinasIdmaquina;
    }

    public int getMusculosIdmusculos() {
        return musculosIdmusculos;
    }

    public void setMusculosIdmusculos(int musculosIdmusculos) {
        this.musculosIdmusculos = musculosIdmusculos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idejercicios;
        hash += (int) clienteidCliente;
        hash += (int) maquinasIdmaquina;
        hash += (int) musculosIdmusculos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RutinaPK)) {
            return false;
        }
        RutinaPK other = (RutinaPK) object;
        if (this.idejercicios != other.idejercicios) {
            return false;
        }
        if (this.clienteidCliente != other.clienteidCliente) {
            return false;
        }
        if (this.maquinasIdmaquina != other.maquinasIdmaquina) {
            return false;
        }
        if (this.musculosIdmusculos != other.musculosIdmusculos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.RutinaPK[ idejercicios=" + idejercicios + ", clienteidCliente=" + clienteidCliente + ", maquinasIdmaquina=" + maquinasIdmaquina + ", musculosIdmusculos=" + musculosIdmusculos + " ]";
    }
    
}
