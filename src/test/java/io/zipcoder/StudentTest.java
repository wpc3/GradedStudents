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
//        Assert.assertEquals(expectedTestScores,student.getNumberofExamScores());





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
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void getNumberofExamScores() {
    }
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