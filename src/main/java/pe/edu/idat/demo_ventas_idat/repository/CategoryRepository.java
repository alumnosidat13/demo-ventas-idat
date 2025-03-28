package pe.edu.idat.demo_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_ventas_idat.model.Category;

public interface CategoryRepository
        extends JpaRepository<Category, Integer> {

}
