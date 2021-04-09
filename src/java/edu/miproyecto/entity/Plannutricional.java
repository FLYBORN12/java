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
@Table(name = "plannutricional")
@NamedQueries({
    @NamedQuery(name = "Plannutricional.findAll", query = "SELECT p FROM Plannutricional p")})
public class Plannutricional implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlannutricionalPK plannutricionalPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "idDia")
    private String idDia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "desayuno")
    private String desayuno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "onces")
    private String onces;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "almuerzo")
    private String almuerzo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "temaNutricional")
    private String temaNutricional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "instructor_id")
    private int instructorId;

    public Plannutricional() {
    }

    public Plannutricional(PlannutricionalPK plannutricionalPK) {
        this.plannutricionalPK = plannutricionalPK;
    }

    public Plannutricional(PlannutricionalPK plannutricionalPK, String idDia, String desayuno, String onces, String almuerzo, String temaNutricional, int instructorId) {
        this.plannutricionalPK = plannutricionalPK;
        this.idDia = idDia;
        this.desayuno = desayuno;
        this.onces = onces;
        this.almuerzo = almuerzo;
        this.temaNutricional = temaNutricional;
        this.instructorId = instructorId;
    }

    public Plannutricional(int idplanNutricional, int clienteId) {
        this.plannutricionalPK = new PlannutricionalPK(idplanNutricional, clienteId);
    }

    public PlannutricionalPK getPlannutricionalPK() {
        return plannutricionalPK;
    }

    public void setPlannutricionalPK(PlannutricionalPK plannutricionalPK) {
        this.plannutricionalPK = plannutricionalPK;
    }

    public String getIdDia() {
        return idDia;
    }

    public void setIdDia(String idDia) {
        this.idDia = idDia;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getOnces() {
        return onces;
    }

    public void setOnces(String onces) {
        this.onces = onces;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public String getTemaNutricional() {
        return temaNutricional;
    }

    public void setTemaNutricional(String temaNutricional) {
        this.temaNutricional = temaNutricional;
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
        hash += (plannutricionalPK != null ? plannutricionalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plannutricional)) {
            return false;
        }
        Plannutricional other = (Plannutricional) object;
        if ((this.plannutricionalPK == null && other.plannutricionalPK != null) || (this.plannutricionalPK != null && !this.plannutricionalPK.equals(other.plannutricionalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Plannutricional[ plannutricionalPK=" + plannutricionalPK + " ]";
    }
    
}
