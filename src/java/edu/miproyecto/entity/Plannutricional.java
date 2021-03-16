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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanf
 */
@Entity
@Table(name = "plannutricional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plannutricional.findAll", query = "SELECT p FROM Plannutricional p")})
public class Plannutricional implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlannutricionalPK plannutricionalPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Alimento")
    private String alimento;
    @JoinColumn(name = "Cliente_idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente cliente;
    @JoinColumn(name = "Dia_idDia", referencedColumnName = "idDia", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dia dia;
    @JoinColumn(name = "Timefood_idTimefood", referencedColumnName = "idTimefood", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Timefood timefood;

    public Plannutricional() {
    }

    public Plannutricional(PlannutricionalPK plannutricionalPK) {
        this.plannutricionalPK = plannutricionalPK;
    }

    public Plannutricional(PlannutricionalPK plannutricionalPK, String alimento) {
        this.plannutricionalPK = plannutricionalPK;
        this.alimento = alimento;
    }

    public Plannutricional(String timefoodidTimefood, String diaidDia, int clienteidCliente) {
        this.plannutricionalPK = new PlannutricionalPK(timefoodidTimefood, diaidDia, clienteidCliente);
    }

    public PlannutricionalPK getPlannutricionalPK() {
        return plannutricionalPK;
    }

    public void setPlannutricionalPK(PlannutricionalPK plannutricionalPK) {
        this.plannutricionalPK = plannutricionalPK;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Timefood getTimefood() {
        return timefood;
    }

    public void setTimefood(Timefood timefood) {
        this.timefood = timefood;
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
