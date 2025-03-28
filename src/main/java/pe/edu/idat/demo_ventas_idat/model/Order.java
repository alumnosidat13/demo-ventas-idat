package pe.edu.idat.demo_ventas_idat.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy
            = GenerationType.IDENTITY)
    private Integer orderid;
    private Date orderdate;
}
