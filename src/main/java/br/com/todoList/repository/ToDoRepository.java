package br.com.todoList.repository;

import br.com.todoList.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<Tasks, Long> {

}
