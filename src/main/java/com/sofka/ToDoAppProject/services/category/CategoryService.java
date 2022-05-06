package com.sofka.ToDoAppProject.services.category;

import com.sofka.ToDoAppProject.models.dto.CategoryDTO;
import com.sofka.ToDoAppProject.models.entities.Category;

import java.util.List;

public interface CategoryService {

    public List<CategoryDTO> getCategoriesDTO();
    public CategoryDTO saveCategoryDTO(CategoryDTO categoryDTO);
    public void deleteCategoryDTO(Long id);
    public CategoryDTO getCategoryId(Long id);


}
