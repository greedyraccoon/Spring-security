package com.graccoon.springsecurity.Controller;

import com.graccoon.springsecurity.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = Arrays.asList(
            new Student("Suman", 55),
            new Student("Raj", 70)
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
}
