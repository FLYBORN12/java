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
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "horario_turno")
    private String horarioTurno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol_idrol1")
    private int rolIdrol1;

    public UsuarioPK() {
    }

    public UsuarioPK(int idusuario, String horarioTurno, int rolIdrol1) {
        this.idusuario = idusuario;
        this.horarioTurno = horarioTurno;
        this.rolIdrol1 = rolIdrol1;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getHorarioTurno() {
        return horarioTurno;
    }

    public void setHorarioTurno(String horarioTurno) {
        this.horarioTurno = horarioTurno;
    }

    public int getRolIdrol1() {
        return rolIdrol1;
    }

    public void setRolIdrol1(int rolIdrol1) {
        this.rolIdrol1 = rolIdrol1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (horarioTurno != null ? horarioTurno.hashCode() : 0);
        hash += (int) rolIdrol1;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if ((this.horarioTurno == null && other.horarioTurno != null) || (this.horarioTurno != null && !this.horarioTurno.equals(other.horarioTurno))) {
            return false;
        }
        if (this.rolIdrol1 != other.rolIdrol1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.UsuarioPK[ idusuario=" + idusuario + ", horarioTurno=" + horarioTurno + ", rolIdrol1=" + rolIdrol1 + " ]";
    }
    
}
