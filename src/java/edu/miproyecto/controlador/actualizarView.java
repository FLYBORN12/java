/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.controlador;

import edu.miproyecto.entity.Cliente;
import edu.miproyecto.facade.ClienteFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author juanf
 */
@Named(value = "actualizarView")
@SessionScoped
public class actualizarView implements Serializable {

    @EJB
    ClienteFacadeLocal clientefacadelocal;
    /**
     * Creates a new instance of actualizarView
     */
    private String mensaje = "";
    private String contraseniavieja = "";
    private Cliente objcliente = new Cliente();
    private Cliente idcliente;

    public actualizarView() {
    }

    /*public void actualizar() {
        try {
            clientefacadelocal.actualizacion(idclientein, tipoidin, nombrein, apellidoin, epsin, direccionin, acudientein, telacudienin, correoin, clavein, generoin, telefonoin);
            mensaje = "sia";
        } catch (Exception e) {
            System.out.println("edu.miproyecto.controlador.actualizarView.actualizar()" + e.getMessage());
            mensaje = "noa";
        }

    }*/
    public void eliminar() {
        try {
            clientefacadelocal.remove(objcliente);
            System.out.println("Cliente eliminado");
        } catch (Exception e) {
            System.out.println("Error al eliminar el cliente " + e);
        }
    }

    public void actualizar() {
        try {
            clientefacadelocal.edit(objcliente);
            objcliente = new Cliente();
            mensaje = "sia";
        } catch (Exception e) {
            mensaje = "noa";
            System.out.println("La falla en la actualizacion es  :" + e);
        }
    }

    // Metodo para cancelar
    public void cancelaractualizar() {
        try {
            mensaje = "cancelado";
            objcliente = new Cliente();
        } catch (Exception e) {
            System.out.println("edu.miproyecto.controlador.actualizarView.cancelaractualizar()" + e.getMessage());
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Cliente getObjcliente() {
        return objcliente;
    }

    public void setObjcliente(Cliente objcli) {
        this.objcliente = objcli;
    }

    public String getContraseniavieja() {
        return contraseniavieja;
    }

    public void setContraseniavieja(String contraseniavieja) {
        this.contraseniavieja = contraseniavieja;
    }

}
