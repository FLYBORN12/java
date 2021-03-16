package edu.miproyecto.entity;

import edu.miproyecto.entity.OrdenCompra;
import edu.miproyecto.entity.Planes;
import edu.miproyecto.entity.Plannutricional;
import edu.miproyecto.entity.Rutina;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> tipoid;
    public static volatile SingularAttribute<Cliente, String> fechaNacimiento;
    public static volatile SingularAttribute<Cliente, String> acudiente;
    public static volatile CollectionAttribute<Cliente, Planes> planesCollection;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> eps;
    public static volatile CollectionAttribute<Cliente, Plannutricional> plannutricionalCollection;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, Integer> edad;
    public static volatile SingularAttribute<Cliente, String> telofonoAcudi;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile CollectionAttribute<Cliente, Rutina> rutinaCollection;
    public static volatile SingularAttribute<Cliente, String> rh;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> genero;
    public static volatile SingularAttribute<Cliente, String> correo;
    public static volatile SingularAttribute<Cliente, String> contrasenia;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile CollectionAttribute<Cliente, OrdenCompra> ordenCompraCollection;

}