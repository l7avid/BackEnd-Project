package com.sofka.ToDoAppProject.controller;

import com.sofka.ToDoAppProject.models.dto.CategoryDTO;
import com.sofka.ToDoAppProject.models.dto.ToDoDTO;
import com.sofka.ToDoAppProject.models.entities.ToDo;
import com.sofka.ToDoAppProject.services.category.CategoryService;
import com.sofka.ToDoAppProject.services.todo.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ToDoController {

    @Autowired
    private ToDoService service;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("get/todo")
    public List<ToDoDTO> getAllToDos(){
        return service.getToDoDTOs();
    }

    @PostMapping("save/todo")
    public List<CategoryDTO> saveToDo(@RequestBody ToDoDTO toDoDTO){
        service.saveToDoDTO(toDoDTO);
        return categoryService.getCategoriesDTO();
    }

    @PutMapping("update/todo")
    public List<CategoryDTO> updateToDo(@RequestBody ToDoDTO toDoDTO){
        if(toDoDTO.getId() != null){
            service.saveToDoDTO(toDoDTO);
        }else{
            throw new RuntimeException("Non-existing ToDo");
        }
        return categoryService.getCategoriesDTO();
    }

    @DeleteMapping("delete/todo/{id}")
    public void deleteToDo(@PathVariable Long id){
        service.deleteToDo(id);
    }
}
