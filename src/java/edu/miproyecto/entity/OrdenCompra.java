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
@Table(name = "orden_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenCompra.findAll", query = "SELECT o FROM OrdenCompra o")})
public class OrdenCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdenCompraPK ordenCompraPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "Cliente_idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente cliente;
    @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto producto;

    public OrdenCompra() {
    }

    public OrdenCompra(OrdenCompraPK ordenCompraPK) {
        this.ordenCompraPK = ordenCompraPK;
    }

    public OrdenCompra(OrdenCompraPK ordenCompraPK, String fecha) {
        this.ordenCompraPK = ordenCompraPK;
        this.fecha = fecha;
    }

    public OrdenCompra(int numfactura, int clienteidCliente, int productoIdproducto) {
        this.ordenCompraPK = new OrdenCompraPK(numfactura, clienteidCliente, productoIdproducto);
    }

    public OrdenCompraPK getOrdenCompraPK() {
        return ordenCompraPK;
    }

    public void setOrdenCompraPK(OrdenCompraPK ordenCompraPK) {
        this.ordenCompraPK = ordenCompraPK;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenCompraPK != null ? ordenCompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCompra)) {
            return false;
        }
        OrdenCompra other = (OrdenCompra) object;
        if ((this.ordenCompraPK == null && other.ordenCompraPK != null) || (this.ordenCompraPK != null && !this.ordenCompraPK.equals(other.ordenCompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.OrdenCompra[ ordenCompraPK=" + ordenCompraPK + " ]";
    }
    
}
