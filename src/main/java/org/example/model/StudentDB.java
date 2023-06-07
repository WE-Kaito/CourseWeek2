package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {
    List<Student2> students;

    public StudentDB(Student2... values){
        students = new ArrayList<>(Arrays.asList(values));
    }

    public Student2[] getAllStudents(){
        return students.toArray(new Student2[students.size()]);
    }

    public Student2 randomStudent(){
        int randomIndex = (int) (Math.random() * students.size());
        return students.get(randomIndex);
    }

    public String toString(){
        return students + "\nRandom student is: "+ randomStudent();
    }

    public void addStudent(Student2 newStudent){
        students.add(newStudent);
    }

    public void removeStudent(Student2 oldStudent){
        students.remove(oldStudent);
    }
}

