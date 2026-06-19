package com.graccoon.springsecurity.Controller;

import com.graccoon.springsecurity.Model.Student;
import com.graccoon.springsecurity.Service.MyUserDetailService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.* ;

@RestController
public class HelloController {


    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Hello Raccoon  " + request.getRequestedSessionId();
    }

    List<Student> students = Arrays.asList(
            new Student("Suman", 55),
            new Student("Raj", 70)
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
}

