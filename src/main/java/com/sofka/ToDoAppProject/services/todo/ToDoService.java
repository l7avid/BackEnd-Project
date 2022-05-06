package com.sofka.ToDoAppProject.services.todo;

import com.sofka.ToDoAppProject.models.dto.ToDoDTO;

import java.util.List;

public interface ToDoService {

    public List<ToDoDTO> getToDoDTOs();
    public ToDoDTO saveToDoDTO(ToDoDTO toDoDTO);
    public void deleteToDo(Long id);
    //public ToDoDTO updateToDo(ToDoDTO toDoDTO);
    public ToDoDTO getToDoId(Long Id);
}
