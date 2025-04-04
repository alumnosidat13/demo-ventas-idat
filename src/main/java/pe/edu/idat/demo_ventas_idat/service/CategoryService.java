package pe.edu.idat.demo_ventas_idat.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.Category;
import pe.edu.idat.demo_ventas_idat.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> obtenerCategorias(){
        // select * from categories;
        return categoryRepository.findAll();
    }

    public Category obtenerCategoriaXid(int id){
        //select * from categories where categoryid=:id
        return categoryRepository.findById(id)
                .orElse(null);
    }


    public void guardarCategoria(Category category){
        //insert into categories values (.....)
        //update categories set ..... where ....
        categoryRepository.save(category);
    }
}
