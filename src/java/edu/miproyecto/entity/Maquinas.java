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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "maquinas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maquinas.findAll", query = "SELECT m FROM Maquinas m")})
public class Maquinas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmaquina")
    private Integer idmaquina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "stock")
    private String stock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maquinas", fetch = FetchType.LAZY)
    private Collection<Rutina> rutinaCollection;

    public Maquinas() {
    }

    public Maquinas(Integer idmaquina) {
        this.idmaquina = idmaquina;
    }

    public Maquinas(Integer idmaquina, String nombre, String estado, String stock) {
        this.idmaquina = idmaquina;
        this.nombre = nombre;
        this.estado = estado;
        this.stock = stock;
    }

    public Integer getIdmaquina() {
        return idmaquina;
    }

    public void setIdmaquina(Integer idmaquina) {
        this.idmaquina = idmaquina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
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
        hash += (idmaquina != null ? idmaquina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maquinas)) {
            return false;
        }
        Maquinas other = (Maquinas) object;
        if ((this.idmaquina == null && other.idmaquina != null) || (this.idmaquina != null && !this.idmaquina.equals(other.idmaquina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Maquinas[ idmaquina=" + idmaquina + " ]";
    }
    
}
