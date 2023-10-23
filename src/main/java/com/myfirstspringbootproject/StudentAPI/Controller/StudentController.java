package com.myfirstspringbootproject.StudentAPI.Controller;

import com.myfirstspringbootproject.StudentAPI.Model.Student;
import com.myfirstspringbootproject.StudentAPI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @RequestMapping("/api/getAllStudents") // this will create a user link to access the student list using get all student function
    @GetMapping
    public List<Student> getAllStudents(){
       return studentservice.getAllStudents();
    }

    @RequestMapping("/api/getMaximumAptitude")
    @GetMapping
    public Student getMaximumAptitude(){
        return studentservice.getMaximumAptitude();
    }

    @RequestMapping("/api/{studentID}/calculateBMI")
    @GetMapping
    public int calculateBMI(@PathVariable String studentID){
        return studentservice.calculateBMI(studentID);
    }

    @RequestMapping("/api/addStudent")
    @PostMapping
    public String addStudent(@RequestBody Student obj){
        studentservice.addStudent(obj);
        return "Student is added in the database successfully";
    }

    @RequestMapping("/api/{studentID}/updateDetails")
    @PutMapping
    public String updateDetailsByID(@PathVariable String studentID, @RequestBody Student obj){
        studentservice.updateDetailsByID(studentID, obj);
        return "Student data is update successfully" + studentID;
    }

    @DeleteMapping("/api/{studentID}/delete")
    public String deleteByID(@PathVariable String studentID){
        studentservice.deleteByID(studentID);
        return "Student data is deleted successfully " + studentID;
    }



}
