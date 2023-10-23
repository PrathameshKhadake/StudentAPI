package com.myfirstspringbootproject.StudentAPI.Repository;


import com.myfirstspringbootproject.StudentAPI.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    HashMap<String, Student> StudentDB;

    public StudentRepository() {

//        StudentDB = new HashMap<>();

        // add students details by manually in database or hashmap
        StudentDB.put("Student1", new Student("Prathamesh", "std1", 170, 50, 9, "Bengalor", 23));
        StudentDB.put("Student2", new Student("Ashish", "std2", 160, 40, 8, "Pune", 23));
        StudentDB.put("Student3", new Student("Swapnil", "std3", 160, 40, 7, "Nipani", 23));

    }

    //create a get student details function by using student id
    public Student getStudentDetailsByID(String studentID){
        return StudentDB.get(studentID);
    }

    //create a get all student function
    public List<Student> getAllStudent(){
        List<Student> allStudents = new ArrayList<>();

        for(String key : StudentDB.keySet()){
            allStudents.add(StudentDB.get(key));
        }

        return allStudents;
    }

    //create add student function to add a student in the database or in hashmap
    public void addStudent(Student obj){
        String studentID = obj.getId();
        StudentDB.put(studentID, obj);
    }

    //create update function to update the student details by their id
    public void updateDetailsByID(String studentID, Student obj){
        StudentDB.put(studentID, obj);
    }

    // create a delete function to delete student from database
    public void deleteByID(String studentID){
        StudentDB.remove(studentID);
    }
}
