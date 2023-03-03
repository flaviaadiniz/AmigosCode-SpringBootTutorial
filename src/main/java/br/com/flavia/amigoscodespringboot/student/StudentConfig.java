package br.com.flavia.amigoscodespringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    private final StudentRepository studentRepository;

    public StudentConfig(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            Student flavia = new Student(
                    "Flávia",
                    "flaviaadiniz@gmail.com",
                    LocalDate.of(1984, 5, 4));

            Student maria = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(1984, 4, 22));

            studentRepository.saveAll(List.of(flavia, maria));
        };
    }

}
