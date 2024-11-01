package br.com.todoList.controller;

import br.com.todoList.dto.TasksDto;
import br.com.todoList.service.ToDoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @PostMapping
    public TasksDto createTask(@RequestBody TasksDto tasksDto) {
        return service.createTask(tasksDto);
    }

    @PutMapping("/{id}")
    public Optional<TasksDto> updateTask(@PathVariable Long id, @RequestBody TasksDto tasksDto) {
        return service.updateTask(id, tasksDto);
    }

    @GetMapping("/{id}")
    public Optional<TasksDto> listOneTask(@PathVariable Long id) {
        return service.listOneTask(id);
    }

    @GetMapping
    public List<TasksDto> listAllTasks() {
        return service.listAllTasks();
    }

    @DeleteMapping("/{id}")
    public void deleteOneTask(@PathVariable("id") Long id) {
        service.deleteOneTask(id);
    }
}