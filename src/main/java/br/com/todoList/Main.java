package br.com.todoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.todoList")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}