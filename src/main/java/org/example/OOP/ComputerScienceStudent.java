package org.example.OOP;

public class ComputerScienceStudent extends OOPStudent implements Citizen {
    String language = "java";

    public String getCourseInformation(){
        setCourse("Computer Science");
        return super.course + "\n Currently learning: "+ language;
    }
    public ComputerScienceStudent(String name){
        super(name);
    }

    @Override
    public String getAddress() {
        return "Address of this Student";
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }

}