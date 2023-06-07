package org.example;

import org.example.model.Student;
import org.example.model.Student2;
import org.example.model.StudentDB;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Student student1 = new Student("Anna");
        student1.setAge(17);
        System.out.println(student1);

        Student student2 = new Student();
        student2.name = "Sophie";
        student2.setAge(17);
        System.out.println(student2);

        System.out.println("Are students similar? "+ student1.equals(student2));
        */

        Student2 student1 = new Student2("Pia");
        Student2 student2 = new Student2("Benjamin");
        Student2 student3 = new Student2("Gökhan");
        Student2 student4 = new Student2("Enrico");
        StudentDB studentDb = new StudentDB(student1, student2, student3, student4);

        System.out.println(studentDb);

        // addStudent Functionality test
        Student2 student5 = new Student2("Alexander");
        studentDb.addStudent(student5);
        System.out.println(studentDb);

        studentDb.removeStudent(student4);

        System.out.println(Arrays.toString(studentDb.getAllStudentsArray()));
        // removeStudent
    }


}

