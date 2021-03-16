package edu.miproyecto.entity;

import edu.miproyecto.entity.Cliente;
import edu.miproyecto.entity.Maquinas;
import edu.miproyecto.entity.Musculos;
import edu.miproyecto.entity.RutinaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(Rutina.class)
public class Rutina_ { 

    public static volatile SingularAttribute<Rutina, Cliente> cliente;
    public static volatile SingularAttribute<Rutina, String> temanutricional;
    public static volatile SingularAttribute<Rutina, Musculos> musculos;
    public static volatile SingularAttribute<Rutina, String> repeticiones;
    public static volatile SingularAttribute<Rutina, RutinaPK> rutinaPK;
    public static volatile SingularAttribute<Rutina, Maquinas> maquinas;
    public static volatile SingularAttribute<Rutina, String> imagenUrl;

}