package com.myfirstspringbootproject.StudentAPI.Service;

import com.myfirstspringbootproject.StudentAPI.Model.Student;
import com.myfirstspringbootproject.StudentAPI.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    //create a function to calculate bmi
    public int calculateBMI(String studentID){
        Student obj = this.studentRepo.getStudentDetailsByID(studentID);
        int weight = obj.getWeight();
        int height = obj.getHeight();

        int bmi = (weight * height)/ height;
        return bmi;

    }

    //create a function to get a maximum aptitude student
    public Student getMaximumAptitude(){
        List<Student> allStudents = studentRepo.getAllStudent();
        int max = Integer.MIN_VALUE;
        Student obj = null;
        for(Student st : allStudents){
            if(max < st.getAptitude()){
                max = st.getAptitude();
                obj = st;
            }
        }
        return obj;
    }

    //create get all students function to give the list of student
    public List<Student> getAllStudents(){

        return studentRepo.getAllStudent();
    }

    //create a add student function to add student in database
    public void addStudent(Student obj){
        studentRepo.addStudent(obj);
    }

    //create to update student details by their id
    public void updateDetailsByID(String studentID, Student obj){
        studentRepo.updateDetailsByID(studentID,obj);
    }

    //create to delete student
    public void deleteByID(String studentID){
        studentRepo.deleteByID(studentID);
    }

}
