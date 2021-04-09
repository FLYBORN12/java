/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "ordencompra")
@NamedQueries({
    @NamedQuery(name = "Ordencompra.findAll", query = "SELECT o FROM Ordencompra o")})
public class Ordencompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recepcionista_id")
    private int recepcionistaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_id")
    private int clienteId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "producto_idproducto")
    private String productoIdproducto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOrdenCompra")
    private Integer idOrdenCompra;

    public Ordencompra() {
    }

    public Ordencompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public Ordencompra(Integer idOrdenCompra, int cantidad, int recepcionistaId, int clienteId, String productoIdproducto) {
        this.idOrdenCompra = idOrdenCompra;
        this.cantidad = cantidad;
        this.recepcionistaId = recepcionistaId;
        this.clienteId = clienteId;
        this.productoIdproducto = productoIdproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getRecepcionistaId() {
        return recepcionistaId;
    }

    public void setRecepcionistaId(int recepcionistaId) {
        this.recepcionistaId = recepcionistaId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(String productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    public Integer getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenCompra != null ? idOrdenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordencompra)) {
            return false;
        }
        Ordencompra other = (Ordencompra) object;
        if ((this.idOrdenCompra == null && other.idOrdenCompra != null) || (this.idOrdenCompra != null && !this.idOrdenCompra.equals(other.idOrdenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.Ordencompra[ idOrdenCompra=" + idOrdenCompra + " ]";
    }
    
}
