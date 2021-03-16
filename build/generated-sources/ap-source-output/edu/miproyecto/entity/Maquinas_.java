package edu.miproyecto.entity;

import edu.miproyecto.entity.Rutina;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(Maquinas.class)
public class Maquinas_ { 

    public static volatile SingularAttribute<Maquinas, String> estado;
    public static volatile CollectionAttribute<Maquinas, Rutina> rutinaCollection;
    public static volatile SingularAttribute<Maquinas, Integer> idmaquina;
    public static volatile SingularAttribute<Maquinas, String> stock;
    public static volatile SingularAttribute<Maquinas, String> nombre;

}