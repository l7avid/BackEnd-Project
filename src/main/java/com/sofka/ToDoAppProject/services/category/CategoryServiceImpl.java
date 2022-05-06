package com.sofka.ToDoAppProject.services.category;

import com.sofka.ToDoAppProject.models.dto.CategoryDTO;
import com.sofka.ToDoAppProject.models.entities.Category;
import com.sofka.ToDoAppProject.models.mapper.CategoryMapper;
import com.sofka.ToDoAppProject.repository.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper mapper;

    @Override
    public List<CategoryDTO> getCategoriesDTO() {
        List<Category> categories = categoryRepository.findAll();
        return mapper.toCategoryDTOs(categories);
    }

    //Always the parameter will be a DTO, and we need to convert it (map it) to an entity in order to
    //save it to the DB
    @Override
    public CategoryDTO saveCategoryDTO(CategoryDTO categoryDTO) {
        Category category = mapper.toCategory(categoryDTO);
        return mapper.toCategoryDTO(categoryRepository.save(category));
    }

    @Override
    public void deleteCategoryDTO(Long id) {
        categoryRepository.delete(mapper.toCategory(getCategoryId(id)));
    }

    @Override
    public CategoryDTO getCategoryId(Long id) {
        Category category = categoryRepository.getById(id);
        return mapper.toCategoryDTO(category);
    }
}
