package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student harshan=new Student(
                    "Harshan",
                    LocalDate.of(2000, Month.FEBRUARY, 1),
                    "harshan92@gmail.com"
            );

            Student milliam=new Student(
                    "Milliam",
                    LocalDate.of(1984, Month.FEBRUARY, 23),
                    "milliam83@gmail.com"
            );

            repository.saveAll(
                    List.of(milliam, harshan)
            );
        };
    }
}
