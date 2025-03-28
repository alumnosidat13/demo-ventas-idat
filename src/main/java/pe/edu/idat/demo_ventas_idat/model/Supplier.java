package pe.edu.idat.demo_ventas_idat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierid;
    private String address;
    private String city;
    private String companyname;
    private String contactname;
    private String contacttitle;
    private String country;
    private String fax;
    private String phone;
    private String postalcode;
    private String homepage;
    private String region;

}
