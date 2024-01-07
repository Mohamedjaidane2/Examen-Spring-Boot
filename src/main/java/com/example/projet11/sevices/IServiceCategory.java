package com.example.projet11.sevices;

import com.example.projet11.entities.Category;

import java.util.List;

public interface IServiceCategory {
    public Category createCategory(Category f);

    public  Category findCategoryById(int id);

    public Category updateCategory (Category f);

    public  List<Category> findAllCategorys();

    public void deleteCategory(Category f);
}
