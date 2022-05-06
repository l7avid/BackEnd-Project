package com.sofka.ToDoAppProject.services.todo;

import com.sofka.ToDoAppProject.models.dto.ToDoDTO;
import com.sofka.ToDoAppProject.models.entities.ToDo;
import com.sofka.ToDoAppProject.models.mapper.ToDoMapper;
import com.sofka.ToDoAppProject.repository.todo.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    ToDoRepository toDoRepository;

    @Autowired
    ToDoMapper mapper;

    @Override
    public List<ToDoDTO> getToDoDTOs() {
        List<ToDo> toDos = toDoRepository.findAll();
        return mapper.toToDoDTOs(toDos);
    }

    @Override
    public ToDoDTO saveToDoDTO(ToDoDTO toDoDTO) {
        ToDo toDo = mapper.toToDo(toDoDTO);
        return mapper.toToDoDTO(toDoRepository.save(toDo));
    }

    @Override
    public void deleteToDo(Long id) {
        ToDo toDo = mapper.toToDo(getToDoId(id));
        toDoRepository.delete(toDo);
    }


    @Override
    public ToDoDTO getToDoId(Long id) {
        ToDo toDo = toDoRepository.getById(id);
        return mapper.toToDoDTO(toDo);
    }

}
