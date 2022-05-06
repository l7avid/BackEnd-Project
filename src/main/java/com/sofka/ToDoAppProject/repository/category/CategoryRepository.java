package com.sofka.ToDoAppProject.repository.category;

import com.sofka.ToDoAppProject.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
