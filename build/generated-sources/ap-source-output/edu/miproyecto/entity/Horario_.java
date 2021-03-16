package edu.miproyecto.entity;

import edu.miproyecto.entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, String> fecha;
    public static volatile SingularAttribute<Horario, String> horasalida;
    public static volatile SingularAttribute<Horario, String> turno;
    public static volatile CollectionAttribute<Horario, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Horario, String> horallegada;

}