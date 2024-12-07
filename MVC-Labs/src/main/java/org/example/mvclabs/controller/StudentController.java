package org.example.mvclabs.controller;

import com.example.mvclabs.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/student")
    public String getStudent(Model model) {
        Student student = new Student("S101", "Alice", 20);
        model.addAttribute("student", student);
        return "student";
    }
}
