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
@Table(name = "musculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musculos.findAll", query = "SELECT m FROM Musculos m")})
public class Musculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmusculos")
    private Integer idmusculos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "musculos")
    private String musculos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "musculos", fetch = FetchType.LAZY)
    private Collection<Rutina> rutinaCollection;

    public Musculos() {
    }

    public Musculos(Integer idmusculos) {
        this.idmusculos = idmusculos;
    }

    public Musculos(Integer idmusculos, String musculos) {
        this.idmusculos = idmusculos;
        this.musculos = musculos;
    }

    public Integer getIdmusculos() {
        return idmusculos;
    }

    public void setIdmusculos(Integer idmusculos) {
        this.idmusculos = idmusculos;
    }

    public String getMusculos() {
        return musculos;
    }

    public void setMusculos(String musculos) {
        this.musculos = musculos;
    }

    @XmlTransient
    public Collection<Rutina> getRutinaCollection() {
        return rutinaCollection;
    }

    public void setRutinaCollection(Collection<Rutina> rutinaCollection) {
        this.rutinaCollection = rutinaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmusculos != null ? idmusculos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musculos)) {
            return false;
        }
        Musculos other = (Musculos) object;
        if ((this.idmusculos == null && other.idmusculos != null) || (this.idmusculos != null && !this.idmusculos.equals(other.idmusculos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Musculos[ idmusculos=" + idmusculos + " ]";
    }
    
}
