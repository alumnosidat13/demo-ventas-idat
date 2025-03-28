package pe.edu.idat.demo_ventas_idat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;
    //@Column(name = "product_name")
    private String productname; // productName  ==>  product_name
    private String quantityPerUnit;
    private Integer reorderlevel;
    private Double unitprice;
    private Integer unitsinstock;
    private Integer unitsonorder;
    private Boolean discontinued;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "supplierid")
    private Supplier supplier;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Integer getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Integer reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getUnitsinstock() {
        return unitsinstock;
    }

    public void setUnitsinstock(Integer unitsinstock) {
        this.unitsinstock = unitsinstock;
    }

    public Integer getUnitsonorder() {
        return unitsonorder;
    }

    public void setUnitsonorder(Integer unitsonorder) {
        this.unitsonorder = unitsonorder;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }
}
