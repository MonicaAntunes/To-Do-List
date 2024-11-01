package br.com.todoList.dto;

import br.com.todoList.repository.model.Tasks;

public class TasksDto {
    private String name;
    private String description;
    private boolean realized;
    private int priority;

    public TasksDto(String name, String description, boolean realized, int priority) {
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static Tasks fromTasksDtoToTasks(TasksDto tasksDto) {
        return new Tasks(
                tasksDto.getName(),
                tasksDto.getDescription(),
                tasksDto.isRealized(),
                tasksDto.getPriority()
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRealized() {
        return realized;
    }

    public void setRealized(boolean realized) {
        this.realized = realized;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
