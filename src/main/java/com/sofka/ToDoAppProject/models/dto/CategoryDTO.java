package com.sofka.ToDoAppProject.models.dto;

import com.sofka.ToDoAppProject.models.entities.ToDo;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO {

        private Long id;

        private String categoryName;

        private List<ToDo> toDos;

    public Long getCategoryId() {
        return id;
    }

    public void setCategoryId(Long categoryId) {
        this.id = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public void setToDos(List<ToDo> toDos) {
        this.toDos = toDos;
    }

}
