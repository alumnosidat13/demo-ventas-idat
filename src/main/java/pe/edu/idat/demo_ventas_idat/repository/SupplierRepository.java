package pe.edu.idat.demo_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_ventas_idat.model.Supplier;

public interface SupplierRepository extends
        JpaRepository<Supplier, Integer> {
}
