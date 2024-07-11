package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
  private   Student[] students;

    public Classroom(int maxNumberOfStudents){
    this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students =students;

    }

    public Classroom(){
        this.students = new Student[30];


    }

    public Student[] getStudents(){



        return students;
    }

    public double getAverageExamScore(){
        double totalSum = 0;
        int studentSize = students.length;

        //Calculate sum of all exam scores
        for (Student student : students){
            String examScores = student.getExamScores();
            double sum = 0;
        }

//        for(double score : examScores){
//            sum += exam;
//        }


        return 4.0;
    }



}
