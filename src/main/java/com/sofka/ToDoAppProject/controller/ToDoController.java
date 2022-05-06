package com.sofka.ToDoAppProject.controller;

import com.sofka.ToDoAppProject.models.dto.ToDoDTO;
import com.sofka.ToDoAppProject.models.entities.ToDo;
import com.sofka.ToDoAppProject.services.todo.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ToDoController {

    @Autowired
    private ToDoService service;

    @GetMapping("get/todo")
    private List<ToDoDTO> getAllToDos(){
        return service.getToDoDTOs();
    }

    @PostMapping("save/todo")
    public ToDoDTO saveToDo(@RequestBody ToDoDTO toDoDTO){
        return service.saveToDoDTO(toDoDTO);
    }

    @PutMapping("update/todo")
    public ToDoDTO updateToDo(@RequestBody ToDoDTO toDoDTO){
        if(toDoDTO.getId() != null){
            service.saveToDoDTO(toDoDTO);
        }
        throw new RuntimeException("Non-existing ToDo");
    }

    @DeleteMapping("delete/todo/{id}")
    public void deleteToDo(@PathVariable Long id){
        service.deleteToDo(id);
    }
}
