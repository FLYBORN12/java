/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miproyecto.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author juanf
 */
@Named(value = "recuperarpswView")
@SessionScoped
public class recuperarpswView implements Serializable {

    /**
     * Creates a new instance of recuperarpswView
     */
    public recuperarpswView() {
    }
    private String correoin = "";
    private String mensaje = "";
    
      public void enviarmensaje() {
        try {
            Properties propiedad = new Properties();
            propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
            propiedad.setProperty("mail.smtp.starttls.enable", "true");
            propiedad.setProperty("mail smtp port", "587");
            propiedad.setProperty("mail.smtp.auth", "true");

            Session sesion = Session.getDefaultInstance(propiedad);

            String correoEnvia = "peoplegym56r@gmail.com";
            String contrasenia = "Neverbroke1212";
            String destinatario = correoin;
            String asunto = "Recuperar contraseña";
            String anuncio = "230061- Tu codigo para recuperar tu contraseña";

            MimeMessage mail = new MimeMessage(sesion);

            mensaje = "Enviado";
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(anuncio);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasenia);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
        } catch (Exception e) {
            System.out.println("El error en el envio es:" + e);
            mensaje = "No,Enviado";
        }

    }

    public String getCorreoin() {
        return correoin;
    }

    public void setCorreoin(String correoin) {
        this.correoin = correoin;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
      
}
