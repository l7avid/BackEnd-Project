package com.sofka.ToDoAppProject.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ToDo> toDos;

    public Category addToDo(ToDo toDo){
        this.toDos.add(toDo);
        return this;
    }
}
