package com.sofka.ToDoAppProject.controller;

import com.sofka.ToDoAppProject.models.dto.CategoryDTO;
import com.sofka.ToDoAppProject.services.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
@CrossOrigin(origins = "http://localhost:3000/")
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping
    public List<CategoryDTO> categories(){
        return service.getCategoriesDTO();
    }

    @PostMapping
    public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO){
        return service.saveCategoryDTO(categoryDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        service.deleteCategoryDTO(id);
    }
}
