package com.sofka.ToDoAppProject.repository.todo;

import com.sofka.ToDoAppProject.models.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
