package com.sofka.ToDoAppProject.models.dto;

import com.sofka.ToDoAppProject.models.entities.ToDo;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO {

        private Long categoryId;

        private String categoryName;

        private List<ToDo> toDos = new ArrayList<>();

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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
