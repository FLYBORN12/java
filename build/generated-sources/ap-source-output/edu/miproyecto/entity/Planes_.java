package edu.miproyecto.entity;

import edu.miproyecto.entity.Cliente;
import edu.miproyecto.entity.PlanesPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(Planes.class)
public class Planes_ { 

    public static volatile SingularAttribute<Planes, Cliente> cliente;
    public static volatile SingularAttribute<Planes, Double> precio;
    public static volatile SingularAttribute<Planes, PlanesPK> planesPK;
    public static volatile SingularAttribute<Planes, String> nombre;

}