package com.sofka.ToDoAppProject.controller;

import com.sofka.ToDoAppProject.models.dto.CategoryDTO;
import com.sofka.ToDoAppProject.services.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("get/category")
    public List<CategoryDTO> categories(){
        return service.getCategoriesDTO();
    }

    @PostMapping("save/category")
    public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO){
        return service.saveCategoryDTO(categoryDTO);
    }

    @DeleteMapping("delete/category/{id}")
    public void deleteCategory(@PathVariable Long id){
        service.deleteCategoryDTO(id);
    }
}
