package com.fpt.practical.java.student;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class StudentController {
    @GetMapping("/download")
    @CrossOrigin(origins = "http://localhost:1998")
    public String downloadFile() {
        return "s";
    }
}
