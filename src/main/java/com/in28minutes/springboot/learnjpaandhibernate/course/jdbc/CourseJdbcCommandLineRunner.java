package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJdbcRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "in28minutes"));
        repository.insert(new Course(2, "Learn AZURE", "in28minutes"));
        repository.insert(new Course(3, "Learn Docker", "in28minutes"));

        repository.delete(1);

        System.out.println(  repository.select(2));
        System.out.println(  repository.select(3));

    }
}
