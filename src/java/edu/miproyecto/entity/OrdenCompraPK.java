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

/**
 *
 * @author juanf
 */
@Embeddable
public class OrdenCompraPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "numfactura")
    private int numfactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_idCliente")
    private int clienteidCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "producto_idproducto")
    private int productoIdproducto;

    public OrdenCompraPK() {
    }

    public OrdenCompraPK(int numfactura, int clienteidCliente, int productoIdproducto) {
        this.numfactura = numfactura;
        this.clienteidCliente = clienteidCliente;
        this.productoIdproducto = productoIdproducto;
    }

    public int getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(int numfactura) {
        this.numfactura = numfactura;
    }

    public int getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(int clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    public int getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(int productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numfactura;
        hash += (int) clienteidCliente;
        hash += (int) productoIdproducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCompraPK)) {
            return false;
        }
        OrdenCompraPK other = (OrdenCompraPK) object;
        if (this.numfactura != other.numfactura) {
            return false;
        }
        if (this.clienteidCliente != other.clienteidCliente) {
            return false;
        }
        if (this.productoIdproducto != other.productoIdproducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.miproyecto.entity.OrdenCompraPK[ numfactura=" + numfactura + ", clienteidCliente=" + clienteidCliente + ", productoIdproducto=" + productoIdproducto + " ]";
    }
    
}
