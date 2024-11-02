package br.com.todoList.service;

import br.com.todoList.dto.TasksDto;
import br.com.todoList.exceptions.TaskNotFoundException;
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

    public TasksDto createTask(TasksDto tasksDto) {
        Tasks tasks = TasksDto.fromTasksDtoToTasks(tasksDto);
        return Tasks.fromTasksToTasksDto(toDoRepository.save(tasks));
    }

    public Optional<TasksDto> updateTask(Long id, TasksDto tasksDto) throws TaskNotFoundException {
        Optional<Tasks> tasks = toDoRepository.findById(id);
        if (tasks.isPresent()) {
            Tasks task = tasks.get();
            task.setName(tasksDto.getName());
            task.setDescription(tasksDto.getDescription());
            task.setRealized(tasksDto.isRealized());
            task.setPriority(tasksDto.getPriority());
            toDoRepository.save(task);
            return Optional.of(tasksDto);
        } else {
            throw new TaskNotFoundException("Task not found.");
        }
    }

    public Optional<TasksDto> listOneTask(Long id) {
        Optional<Tasks> task = toDoRepository.findById(id);
        return Optional.of(Tasks.fromTasksToTasksDto(task.get()));
    }

    public List<TasksDto> listAllTasks() {
        List<Tasks> tasksList = toDoRepository.findAll();
        List<TasksDto> tasksDtoList = tasksList
                .stream()
                .map(task -> TasksDto.fromTasksDtoToTasks(task));
        return ;
    }

    public void deleteOneTask(Long id) {
        toDoRepository.deleteById(id);
    }
}
