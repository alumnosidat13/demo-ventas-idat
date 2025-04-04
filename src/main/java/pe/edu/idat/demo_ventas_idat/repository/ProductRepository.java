package pe.edu.idat.demo_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_ventas_idat.model.Product;

public interface ProductRepository
        extends JpaRepository<Product, Integer> {

    @Query(value = """
            UPDATE products SET productname= :productname,
            suppleirid = :supplierid,
            categoryid = :categoryid,
            discontinued = :discontinued
            WHERE productid = :productid
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("productname") String productname,
            @Param("supplierid") Integer supplierid,
            @Param("categoryid") Integer categoryid,
            @Param("discontinued") boolean discontinued,
            @Param("productid") Integer productid);


}
