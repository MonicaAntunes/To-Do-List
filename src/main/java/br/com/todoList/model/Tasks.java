package br.com.todoList.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean realized;
    private int priority;

    public Tasks(String name, String description, boolean realized, int priority) {
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }

    public Tasks() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRealized() {
        return realized;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRealized(boolean realized) {
        this.realized = realized;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
