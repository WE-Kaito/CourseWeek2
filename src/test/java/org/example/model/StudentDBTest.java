package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void test_getAllStudents0() {
        StudentDB studentDB = new StudentDB();

        Student2[] expected = {};
        Student2[] actual = studentDB.getAllStudents();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test_getAllStudents4() {
        Student2 student1 = new Student2("Schüler1");
        Student2 student2 = new Student2("John");
        Student2 student3 = new Student2("Mike");

        StudentDB studentDB = new StudentDB(student1, student2, student3);

        Student2[] expected = {student1, student2, student3};
        Student2[] actual = studentDB.getAllStudents(student1, student2, student3);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void test_addStudent() {
        Student2[] students = new Student2[]{
                new Student2("Benjamin"),
                new Student2("Pia"),
                new Student2("Gökhan"),
        };
        StudentDB studentDB = new StudentDB(students);
        Student2 student = new Student2("Enrico");
        studentDB.addStudent(student);
        Student2[] actual = studentDB.getAllStudentsArray();
        Assertions.assertEquals(actual[actual.length - 1], student);
    }
    @Test
    void test_removeStudent() {
        Student2[] students = new Student2[]{
                new Student2("Benjamin"),
                new Student2("Pia"),
                new Student2("Gökhan"),
        };

        StudentDB studentDB = new StudentDB(students);

        Student2 studentToRemove = students[1];

        studentDB.removeStudent(studentToRemove);

        Student2[] updatedStudents = studentDB.getAllStudentsArray();

        Assertions.assertFalse(Arrays.asList(updatedStudents).contains(studentToRemove), "Student should not be in the array after removal");
    }
}