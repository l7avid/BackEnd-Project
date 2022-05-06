package com.sofka.ToDoAppProject.models.mapper;

import com.sofka.ToDoAppProject.models.dto.CategoryDTO;
import com.sofka.ToDoAppProject.models.entities.Category;
import org.mapstruct.*;
import java.util.List;


@Mapper(componentModel = "spring", uses = {ToDoMapper.class})
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "id", target = "categoryId"),
            @Mapping(source = "categoryName", target = "categoryName"),
            @Mapping(source = "toDos", target = "toDos")
    })

    //DestinationType instanceName(OriginType instanceName)
    CategoryDTO toCategoryDTO(Category category);
    List<CategoryDTO> toCategoryDTOs(List<Category> categories);

    @InheritInverseConfiguration
    Category toCategory(CategoryDTO categoryDTO);

}
