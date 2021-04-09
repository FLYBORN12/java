/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author juanf
 */
@Entity
@Table(name = "rutina")
@NamedQueries({
    @NamedQuery(name = "Rutina.findAll", query = "SELECT r FROM Rutina r")})
public class Rutina implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RutinaPK rutinaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "temaRutina")
    private String temaRutina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "musculo")
    private String musculo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "repeticiones")
    private String repeticiones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "maquina")
    private String maquina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "instructor_id")
    private int instructorId;

    public Rutina() {
    }

    public Rutina(RutinaPK rutinaPK) {
        this.rutinaPK = rutinaPK;
    }

    public Rutina(RutinaPK rutinaPK, String temaRutina, String musculo, String repeticiones, String maquina, int instructorId) {
        this.rutinaPK = rutinaPK;
        this.temaRutina = temaRutina;
        this.musculo = musculo;
        this.repeticiones = repeticiones;
        this.maquina = maquina;
        this.instructorId = instructorId;
    }

    public Rutina(int idrutina, int clienteId) {
        this.rutinaPK = new RutinaPK(idrutina, clienteId);
    }

    public RutinaPK getRutinaPK() {
        return rutinaPK;
    }

    public void setRutinaPK(RutinaPK rutinaPK) {
        this.rutinaPK = rutinaPK;
    }

    public String getTemaRutina() {
        return temaRutina;
    }

    public void setTemaRutina(String temaRutina) {
        this.temaRutina = temaRutina;
    }

    public String getMusculo() {
        return musculo;
    }

    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutinaPK != null ? rutinaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rutina)) {
            return false;
        }
        Rutina other = (Rutina) object;
        if ((this.rutinaPK == null && other.rutinaPK != null) || (this.rutinaPK != null && !this.rutinaPK.equals(other.rutinaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Rutina[ rutinaPK=" + rutinaPK + " ]";
    }
    
}
