package com.fasttrack;

import java.util.LinkedList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentGradeList;

    public Classroom(List<StudentGrade> studentGradeList) {
        this.studentGradeList = studentGradeList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new LinkedList<>();
        for (StudentGrade studentGrade : studentGradeList) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> gradesForStudent = new LinkedList<>();
        for (StudentGrade studentGrade : studentGradeList) {
            if (studentGrade.getName().equals(student)) {
                gradesForStudent.add(studentGrade.getGrade());
            }
        }
        return gradesForStudent;
    }

    public StudentGrade getMaxGrade(String discipline) {
        int maxGrade = 0;
        int index = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (maxGrade < studentGrade.getGrade()) {
                    maxGrade = studentGrade.getGrade();
                    index = studentGradeList.indexOf(studentGrade);

                }
            }
        }
        return studentGradeList.get(index);
    }

    public StudentGrade getMaxGrade() {
        int maxGrade = 0;
        int index = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            if (maxGrade <= studentGrade.getGrade()) {
                maxGrade = studentGrade.getGrade();
                index = studentGradeList.indexOf(studentGrade);

            }
        }
        return studentGradeList.get(index);
    }

    public Integer getAverageGrade(String discipline) {
        int sum = 0;
        int gradesNumber = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                sum += studentGrade.getGrade();
                gradesNumber++;
            }
        }
        return sum / gradesNumber;

    }

    public StudentGrade getWorstGrade(String discipline) {
        int maxGrade = 10;
        int indexOfGrade = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (maxGrade >= studentGrade.getGrade()) {
                    maxGrade = studentGrade.getGrade();
                    indexOfGrade = studentGradeList.indexOf(studentGrade);
                }
            }
        }
        return studentGradeList.get(indexOfGrade);
    }

    public double getTheAverage() {
        double maxGrade = 0.0;
        int indexOfGrade = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            maxGrade += studentGrade.getGrade();
            indexOfGrade++;
        }
        return maxGrade / indexOfGrade;

    }

    public StudentGrade getWorstGrade() {
        int maxGrade = 10;
        int indexOfGrade = 0;
        for (StudentGrade studentGrade : studentGradeList) {
                if (maxGrade >= studentGrade.getGrade()) {
                    maxGrade = studentGrade.getGrade();
                    maxGrade = studentGradeList.indexOf(studentGrade);
                }
        }
        return studentGradeList.get(maxGrade);
    }

}

