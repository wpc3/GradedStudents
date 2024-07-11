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

        if (examScores != null) {
            for (Double exam : examScores) {
                this.examScores.add(exam);
            }
        }
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

    public int getNumberOfExamScores() {
        return examScores.size();
    }

    public String getExamScores() {
        StringBuilder sb = new StringBuilder();
        sb.append("Exam Scores: \n");

        int examNumber = 1;//This will print out what exam number was listed/added
        for(Double score: examScores){//For each score print the string below
            sb.append("\tExam").append(examNumber).append(" -> ").append(score).append("\n");
            examNumber++;
        }

        return sb.toString();
    }

    public void  addExamScore(double examScore){
         examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
    if(examNumber >=1 && examNumber <= examScores.size()){//if statement to check if the exam number is in bounds of all the exams
        examScores.set(examNumber-1, newScore);//zero indexing so we can correctly replace the new score to the right element

    }

    }

    public double getAverageExamScores(){
    int sum = 0;

    for(Double exam : examScores){
        sum += exam;
    }


    return (double) sum /examScores.size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append("> Average Score:").append(getAverageExamScores()).append("\n");
        sb.append("Exam Scores: \n");

        int examNumber = 1;//This will print out what exam number was listed/added
        for(Double score: examScores){//For each score print the string below
            sb.append("\tExam").append(examNumber).append(" -> ").append(score).append("\n");
            examNumber++;
        }


    return sb.toString();
    }

//    public String examScoresToString() {
//        StringBuilder sb = new StringBuilder();//turning exam scores to a string
//        for (Double score : examScores) {//for each score in exam score we will append and append commas to seperate
//            sb.append(score).append(", ");
//
//        }
//
//        //Removing the "," after the last score
//        if(sb.length() > 0){
//            sb.setLength(sb.length()-2);
//        }
//        return sb.toString();
//
//    }
}