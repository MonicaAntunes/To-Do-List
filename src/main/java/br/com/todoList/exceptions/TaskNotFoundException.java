package br.com.todoList.exceptions;

public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String error) {
        super(error);
    }
}
