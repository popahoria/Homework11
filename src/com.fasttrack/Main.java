package com.fasttrack;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Classroom classroom= new Classroom(ReadFromFile.readFileBuffered("File/grades.txt"));
        System.out.println(classroom.getGradesForDiscipline("Mathematics"));
        System.out.println(classroom.getGradesForStudent("Dulf Siguror"));
        System.out.println(classroom.getMaxGrade("History"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Computer Science"));
        System.out.println(classroom.getWorstGrade("Physics"));

        ReportGenerator reportGenerator = new ReportGenerator(ReadFromFile.readFileBuffered("File/grades.txt"));
        reportGenerator.generateReport();

    }
}
