package com.example.demo.student;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiOperation(value = "/api/v1/student", tags = "Student Profile Controller")
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ApiOperation(value = "Get all students", response = Iterable.class)
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @ApiOperation(value = "Register new Student", response = Iterable.class)
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @ApiOperation(value = "Delete a student by id", response = Iterable.class)
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @ApiOperation(value = "Update a student name or email", response = Iterable.class)
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required = false) String name, @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }
}
