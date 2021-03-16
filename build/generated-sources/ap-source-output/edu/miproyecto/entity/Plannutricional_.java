package edu.miproyecto.entity;

import edu.miproyecto.entity.Cliente;
import edu.miproyecto.entity.Dia;
import edu.miproyecto.entity.PlannutricionalPK;
import edu.miproyecto.entity.Timefood;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(Plannutricional.class)
public class Plannutricional_ { 

    public static volatile SingularAttribute<Plannutricional, PlannutricionalPK> plannutricionalPK;
    public static volatile SingularAttribute<Plannutricional, Cliente> cliente;
    public static volatile SingularAttribute<Plannutricional, String> alimento;
    public static volatile SingularAttribute<Plannutricional, Dia> dia;
    public static volatile SingularAttribute<Plannutricional, Timefood> timefood;

}