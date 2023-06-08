package org.example.OOP;

public abstract class OOPStudent {

    String name;

    String course;

    public OOPStudent(String name){
        this.name = name;
    }

    abstract String getCourseInformation();

    public void setCourse(String course){
        this.course = course;
    }

}

