package edu.miproyecto.entity;

import edu.miproyecto.entity.Cliente;
import edu.miproyecto.entity.OrdenCompraPK;
import edu.miproyecto.entity.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-03T18:46:26")
@StaticMetamodel(OrdenCompra.class)
public class OrdenCompra_ { 

    public static volatile SingularAttribute<OrdenCompra, String> fecha;
    public static volatile SingularAttribute<OrdenCompra, Cliente> cliente;
    public static volatile SingularAttribute<OrdenCompra, OrdenCompraPK> ordenCompraPK;
    public static volatile SingularAttribute<OrdenCompra, Producto> producto;

}