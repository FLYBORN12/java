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
@Table(name = "rutina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rutina.findAll", query = "SELECT r FROM Rutina r")})
public class Rutina implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RutinaPK rutinaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "imagen_url")
    private String imagenUrl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "repeticiones")
    private String repeticiones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "temanutricional")
    private String temanutricional;
    @JoinColumn(name = "cliente_idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente cliente;
    @JoinColumn(name = "maquinas_idmaquina", referencedColumnName = "idmaquina", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Maquinas maquinas;
    @JoinColumn(name = "musculos_idmusculos", referencedColumnName = "idmusculos", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Musculos musculos;

    public Rutina() {
    }

    public Rutina(RutinaPK rutinaPK) {
        this.rutinaPK = rutinaPK;
    }

    public Rutina(RutinaPK rutinaPK, String imagenUrl, String repeticiones, String temanutricional) {
        this.rutinaPK = rutinaPK;
        this.imagenUrl = imagenUrl;
        this.repeticiones = repeticiones;
        this.temanutricional = temanutricional;
    }

    public Rutina(int idejercicios, int clienteidCliente, int maquinasIdmaquina, int musculosIdmusculos) {
        this.rutinaPK = new RutinaPK(idejercicios, clienteidCliente, maquinasIdmaquina, musculosIdmusculos);
    }

    public RutinaPK getRutinaPK() {
        return rutinaPK;
    }

    public void setRutinaPK(RutinaPK rutinaPK) {
        this.rutinaPK = rutinaPK;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getTemanutricional() {
        return temanutricional;
    }

    public void setTemanutricional(String temanutricional) {
        this.temanutricional = temanutricional;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Maquinas getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(Maquinas maquinas) {
        this.maquinas = maquinas;
    }

    public Musculos getMusculos() {
        return musculos;
    }

    public void setMusculos(Musculos musculos) {
        this.musculos = musculos;
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
