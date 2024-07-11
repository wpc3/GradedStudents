package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getStudentsTest() {
        //Given
        ArrayList<Double> examScoreBill = new ArrayList<>(Arrays.asList(88.1,33.5));
        ArrayList<Double> examScoreWill = new ArrayList<>(Arrays.asList(88.1,33.5));
        Student[] student = {new Student("Bill","Sill", examScoreBill),
        new Student("Will","Pill",examScoreWill)};

        Classroom classroom = new Classroom(student);

        //When
        Student[] actualStudents = classroom.getStudents();

        //Then
        Assert.assertArrayEquals(student,actualStudents);


    }
}