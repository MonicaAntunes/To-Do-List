package br.com.todoList.service;

import br.com.todoList.repository.model.Tasks;
import br.com.todoList.repository.ToDoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public Tasks createTask(Tasks tasks) {
        return toDoRepository.save(tasks);
    }

    public Optional<Tasks> updateTask(Long id, Tasks tasks) {
        toDoRepository.save(tasks);
        return toDoRepository.findById(id);
    }

    public Optional<Tasks> listOneTask(Long id) {
        return toDoRepository.findById(id);
    }

    public List<Tasks> listAllTasks() {
        return toDoRepository.findAll();
    }

    public void deleteOneTask(Long id) {
        toDoRepository.deleteById(id);
    }
}
