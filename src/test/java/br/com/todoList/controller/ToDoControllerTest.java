package br.com.todoList.controller;

import br.com.todoList.service.ToDoService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static reactor.core.publisher.Mono.when;

@ExtendWith(MockitoExtension.class)
public class ToDoControllerTest {

    @InjectMocks
    private ToDoController controller;

    @Mock
    private ToDoService service;

//    private WebTestClient webTestClient;

//    @Test
    //public void testCreateToDoSuccess() {
//        var todo = new ToDoList("Study", "Study a hour per day", true, 1);
//        webTestClient
//                .post()
//                .uri("/todos")
//                .bodyValue(todo)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody()
//                .jsonPath("$").isArray()
//                .jsonPath("$.length()").isEqualTo(1);
//
//    }
}
