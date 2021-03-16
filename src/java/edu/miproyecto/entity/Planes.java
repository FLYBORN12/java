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
@Table(name = "planes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planes.findAll", query = "SELECT p FROM Planes p")})
public class Planes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlanesPK planesPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @JoinColumn(name = "cliente_idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente cliente;

    public Planes() {
    }

    public Planes(PlanesPK planesPK) {
        this.planesPK = planesPK;
    }

    public Planes(PlanesPK planesPK, String nombre, double precio) {
        this.planesPK = planesPK;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Planes(int idplanes, int clienteidCliente) {
        this.planesPK = new PlanesPK(idplanes, clienteidCliente);
    }

    public PlanesPK getPlanesPK() {
        return planesPK;
    }

    public void setPlanesPK(PlanesPK planesPK) {
        this.planesPK = planesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planesPK != null ? planesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planes)) {
            return false;
        }
        Planes other = (Planes) object;
        if ((this.planesPK == null && other.planesPK != null) || (this.planesPK != null && !this.planesPK.equals(other.planesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Planes[ planesPK=" + planesPK + " ]";
    }
    
}
