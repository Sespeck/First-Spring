package com.example.FirstSpring.Student;

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
         return args->{
             Student maria = new Student(
                     "Maria",
                     "Maria.c@gmail.com",
                     LocalDate.of(2000, Month.JANUARY, 10),
                     22
             );

             Student alex = new Student(
                     "Alex",
                     "alex@gmail.com",
                     LocalDate.of(2000, Month.JANUARY, 30),
                     22
             );
             repository.saveAll(List.of(maria, alex));
         };
    }
}
