package pe.edu.idat.demo_ventas_idat.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.Supplier;
import pe.edu.idat.demo_ventas_idat.repository.SupplierRepository;
import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository supplierRepository;
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
    public List<Supplier> obtenerProveedores(){
        return supplierRepository.findAll();
    }
    public Supplier obtenerProveedorXid(int id){
        return supplierRepository.findById(id)
                .orElse(null);
    }
    public void guardarProveedor(Supplier supplier){
        //insert into categories values (.....)
        //update categories set ..... where ....
        supplierRepository.save(supplier);
    }
}
