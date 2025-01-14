package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.repository.TaskRepository;
import br.com.fiap.epictaskapi.repository.UserRepository;

@Configuration
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        taskRepository.saveAll(List.of(
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site"),
            new Task("Modelar BD", "Modelar as tabelas do banco"),
            new Task("Protipar", "Prototipo das telas do site")
        ));

        userRepository.save(
            new User()
                .name("João")
                .email("joao@fiap.com")
                .password("123")
        );
        
    }
    
}
