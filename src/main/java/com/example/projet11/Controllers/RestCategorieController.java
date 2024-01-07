package com.example.projet11.Controllers;

import com.example.projet11.entities.Category;
import com.example.projet11.sevices.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/categories")
public class RestCategorieController {



    @Autowired
    IServiceCategory iServiceCategory;
    
    
    @GetMapping("")
    public List<Category> getall(){
        return iServiceCategory.findAllCategorys();
    }

    @GetMapping("/{id}")
    public Category find(@PathVariable int id){
        return  iServiceCategory.findCategoryById(id);
    }
    @PostMapping("/add")
    public Category add(@RequestBody Category f){
        return  iServiceCategory.createCategory(f);
    }

    @DeleteMapping("/delete/{id}")
    public  String delete (@PathVariable int  id){
        iServiceCategory.deleteCategory(iServiceCategory.findCategoryById(id));
        return "supprimer";
    }

    @PutMapping("/update")
    public String update(@RequestBody Category f){
        iServiceCategory.updateCategory( f);
        return "Category updated";
    }

}
