package org.example.model;

import java.util.Objects;

// Student für Aufgabe 1
public class Student{
    private int age;
    public int birthyear;
    public String name;
    public boolean genderMale;
    private String gender;

    public String getGender(){
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
        birthyear = (2023 - this.age);
    }

    public Student(){
        if (genderMale == true){
            gender = "male";
        } else{
            gender = "female";
        }
    }
    public Student(String name){
        this.name = name;
        if (genderMale == true){
            gender = "male";
        } else{
            gender = "female";
        }
    }

    public String toString(){
        return "Student 001: "+this.name+" , born "+this.birthyear+" , "+ this.getGender();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && birthyear == student.birthyear && genderMale == student.genderMale && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, birthyear, genderMale, gender);
    }
}