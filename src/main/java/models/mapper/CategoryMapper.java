package models.mapper;

import models.dto.CategoryDTO;
import models.entities.Category;
import org.mapstruct.*;
import java.util.List;


@Mapper(componentModel = "spring", uses = {ToDoMapper.class})
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "categoryId", target = "categoryId"),
            @Mapping(source = "categoryName", target = "categoryName"),
            @Mapping(source = "todos", target = "todos")
    })

    //DestinationType instanceName(OriginType instanceName)
    CategoryDTO toCategoryDTO(Category category);
    List<CategoryDTO> toCategoryDTOs(List<Category> categories);

    @InheritInverseConfiguration
    Category toCategory(CategoryDTO categoryDTO);

}
