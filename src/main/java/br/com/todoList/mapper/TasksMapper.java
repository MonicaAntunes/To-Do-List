package br.com.todoList.mapper;

import br.com.todoList.dto.TasksDto;
import br.com.todoList.repository.model.Tasks;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TasksMapper {
    TasksMapper INSTANCE = Mappers.getMapper(TasksMapper.class);
    TasksDto tasksToTasksDto(Tasks tasks);
    Tasks tasksStoToTasks(TasksDto tasksDto);
}
