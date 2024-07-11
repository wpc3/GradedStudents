package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

//    Part 1.1; Defining instance variables
//    Declare an instance variable for each of the previously mentioned properties:
//    String firstName
//    a collection of characters representative of a first name.
//            String lastName
//    a collection of characters representative of a last name.
//            ArrayList<Double> examScores
//    a dynamic collection of decimal values representative of test scores.
//
//    Part 1.2; Defining construction
//    Define a Student constructor whose parameters are used to initalize its instance variables.
//    The Student constructor has expected parameters of
//    String representative of a firstName
//    String representative of a lastName
//    Double[] representative of a collection of testScores
    @Test
    public void testStudentConstructor(){
      //Given
      String expectedFirstName = "Joe";
      String expectedLastName = "Budden";
//      Double[] expectedTestScores = {99.0, 80.0,50.0,77.0};

        ArrayList<Double> examScores = new ArrayList<>();

        Student student = new Student(expectedFirstName, expectedLastName,examScores);

      //When
//      String actualFirstName = student.getFirstName;
//      String actualLastName = student.getLastName;
//      Double[] actualTestScores = student.getTestScores;

      //Then
        Assert.assertEquals(expectedFirstName,student.getFirstName());
        Assert.assertEquals(expectedLastName,student.getLastName());
//        Assert.assertEquals(examScores,student.getExamScores());





    }

    @Test
    public void setLastName() {
     //Given
     ArrayList<Double> examScores = new ArrayList<>();
     examScores.add(55.3);
     examScores.add(44.3);
    Student student = new Student("John", "Doe", examScores);
    String newLastName = "Fig";

    //When
    student.setLastName(newLastName);
    //Then
    Assert.assertEquals(newLastName,student.getLastName());

    }

    @Test
    public void setFirstName() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(55.3);
        examScores.add(44.3);
        Student student = new Student("John", "Doe", examScores);
        String newFirstName = "Fig";

        //When
        student.setFirstName(newFirstName);
        //Then
        Assert.assertEquals(newFirstName,student.getFirstName());
    }

    @Test
    public void getLastName() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(55.3);
        examScores.add(44.3);
        Student student = new Student("John", "Doe", examScores);
        String expectedLastName = "Doe";

        //When
        student.getLastName();
        //Then
        Assert.assertEquals(expectedLastName,student.getLastName());
    }

    @Test
    public void getFirstName() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(55.3);
        examScores.add(44.3);
        Student student = new Student("John", "Doe", examScores);
        String expectedFirstName = "John";

        //When
        student.getLastName();
        //Then
        Assert.assertEquals(expectedFirstName,student.getFirstName());

    }

    @Test
    public void getNumberofExamScores() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(55.3);
        examScores.add(44.3);
        Student student = new Student("John", "Doe", examScores);
        int numberOfExamScore = 2;

        //When
        student.getNumberOfExamScores();
        //Then
        Assert.assertEquals(numberOfExamScore,student.getNumberOfExamScores());
    }

    @Test
    public void getExamScore(){
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student = new Student("John", "Doe", examScores);

        String expectedExamScore = "Exam Scores: \n" +
                "\tExam1 -> 100.0\n" +
                "\tExam2 -> 95.0\n" +
                "\tExam3 -> 123.0\n" +
                "\tExam4 -> 96.0\n";


        //When
//        student.getExamScores();
        //Then
        Assert.assertEquals(expectedExamScore,student.getExamScores());

    }

    @Test
    public void testAddExamScores() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);

        Student student = new Student("John", "Doe", examScores);
        student.addExamScore(100.5);

        String expectedExamScore = "Exam Scores: \n" +
                "\tExam1 -> 100.0\n" +
                "\tExam2 -> 95.0\n" +
                "\tExam3 -> 123.0\n" +
                "\tExam4 -> 96.0\n" +
                "\tExam5 -> 100.5\n";

        //When
//        student.getExamScores();
        //Then
        Assert.assertEquals(expectedExamScore,student.getExamScores());

    }
    @Test
    public void testSetExamScores() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);

        Student student = new Student("John", "Doe", examScores);
        student.setExamScores(3,100.5);

        String expectedExamScore = "Exam Scores: \n" +
                "\tExam1 -> 100.0\n" +
                "\tExam2 -> 95.0\n" +
                "\tExam3 -> 100.5\n" +
                "\tExam4 -> 96.0\n" ;


        //When
//        student.getExamScores();
        //Then
        Assert.assertEquals(expectedExamScore,student.getExamScores());

    }

    @Test
    public void testAverageExamScores() {
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);

        Student student = new Student("John", "Doe", examScores);


        Double expectedAverageExamScore = 103.5;

        Double actualAverageExamScore = student.getAverageExamScores();



        //When
//        student.getExamScores();
        //Then
        Assert.assertEquals(expectedAverageExamScore,actualAverageExamScore);

    }

    @Test
    public void testStringOverride(){
        //Given
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student = new Student("John", "Doe", examScores);

        String expectedExamScore = "Student Name: John Doe\n" +
                "> Average Score:103.5\n" +
                "Exam Scores: \n" +
                "\tExam1 -> 100.0\n" +
                "\tExam2 -> 95.0\n" +
                "\tExam3 -> 123.0\n" +
                "\tExam4 -> 96.0\n";
//
//        "Student Name: John Doe \n" +
//"> Average Score:103.5 \n" +
//        "Exam Scores: \n" +
//        " Exam1 -> 100.0 \n" +
//        " Exam2 -> 95.0 \n" +
//        " Exam3 -> 123.0 \n"+
//        " Exam4 -> 96.0 \n";



        //When
//        student.getExamScores();
        //Then
        Assert.assertEquals(expectedExamScore,student.toString());

    }







//    @Test
//    public void testExamScoresToStirng(){
//        //Given
//        ArrayList<Double> examScores = new ArrayList<>();
//        examScores.add(55.3);
//        examScores.add(44.3);
//        Student student = new Student("John", "Doe", examScores);
//        String expectedExamScoreString = ""
//
//        //When
////        student.getExamScores();
//        //Then
//        Assert.assertEquals(examScores,student.examScoresToString());
//
//    }
//
//    Part 1.3; Defining methods
//    Getters and Setters
//    Define a getter and setter for each of the instance variables declared in the Student class.
//    Note: There should not be a setter for the testScore. This object's state will be mutated via a takeExam method mentioned below.
//    Additionally, define a getter, getNumberOfExamsTaken(), which returns the total number of exams taken by this student.
//
//    Define method getExamScores()
//    Student should define a method which returns a string representation of all exams taken.
//
//    Define method addExamScore(double examScore)
//    Student should define a method named addExamScore which uses a double parameter to add an examScore to its composite List examScores.
//
//    Define method setExamScore(int examNumber, double newScore)
//    Student should define a method named setExamScore which uses an int parameter to identify an exam in the list, and a double parameter to re-assign the respective value.
//    Define method getAverageExamScore()
//    Student should define a method named getAverageExamScore() which returns the sum of the examScore list divided by its size.
//
//    Define method toString()
//    Student should override the toString method by returning a clean String representation of the person.


}