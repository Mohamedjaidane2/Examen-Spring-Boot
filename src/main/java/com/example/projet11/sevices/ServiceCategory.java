package com.example.projet11.sevices;

import com.example.projet11.entities.Category;
import com.example.projet11.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCategory implements IServiceCategory {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category f) {
        return categoryRepository.save(f);


    }

    @Override
    public Category findCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }


    @Override
    public Category updateCategory(Category f) {
        return categoryRepository.save(f);
    }

    @Override
    public List<Category> findAllCategorys() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Category f) {
        categoryRepository.delete(f);
    }

}