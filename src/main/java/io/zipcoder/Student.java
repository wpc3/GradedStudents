package io.zipcoder;

import java.util.ArrayList;

public class Student {
private String firstName;
private String lastName;
private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.examScores = new ArrayList<>();
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumberofExamScores() {
        return examScores.size();
    }

}
