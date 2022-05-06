package com.sofka.ToDoAppProject.models.mapper;

import com.sofka.ToDoAppProject.models.dto.ToDoDTO;
import com.sofka.ToDoAppProject.models.entities.ToDo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ToDoMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "done", target = "done"),
            @Mapping(source = "categoryId", target = "categoryId")
    })
    ToDoDTO toToDoDTO(ToDo toDo);
    List<ToDoDTO> toToDoDTOs(List<ToDo> todos);

    @InheritInverseConfiguration
    ToDo toToDo(ToDoDTO toDoDTO);
}
