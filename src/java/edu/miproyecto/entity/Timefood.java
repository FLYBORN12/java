/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juanf
 */
@Entity
@Table(name = "timefood")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Timefood.findAll", query = "SELECT t FROM Timefood t")})
public class Timefood implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "idTimefood")
    private String idTimefood;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timefood", fetch = FetchType.LAZY)
    private Collection<Plannutricional> plannutricionalCollection;

    public Timefood() {
    }

    public Timefood(String idTimefood) {
        this.idTimefood = idTimefood;
    }

    public String getIdTimefood() {
        return idTimefood;
    }

    public void setIdTimefood(String idTimefood) {
        this.idTimefood = idTimefood;
    }

    @XmlTransient
    public Collection<Plannutricional> getPlannutricionalCollection() {
        return plannutricionalCollection;
    }

    public void setPlannutricionalCollection(Collection<Plannutricional> plannutricionalCollection) {
        this.plannutricionalCollection = plannutricionalCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTimefood != null ? idTimefood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Timefood)) {
            return false;
        }
        Timefood other = (Timefood) object;
        if ((this.idTimefood == null && other.idTimefood != null) || (this.idTimefood != null && !this.idTimefood.equals(other.idTimefood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Timefood[ idTimefood=" + idTimefood + " ]";
    }
    
}
