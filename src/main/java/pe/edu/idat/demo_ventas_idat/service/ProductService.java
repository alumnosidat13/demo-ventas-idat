package pe.edu.idat.demo_ventas_idat.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.Product;
import pe.edu.idat.demo_ventas_idat.model.Supplier;
import pe.edu.idat.demo_ventas_idat.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> obtenerProductos(){
        return productRepository.findAll();
    }
    public Product obtenerProductoXid(int id){
        return productRepository.findById(id)
                .orElse(null);
    }
    public void guardarProducto(Product product){
        //insert into categories values (.....)
        //update categories set ..... where ....
        productRepository.save(product);
    }

}
