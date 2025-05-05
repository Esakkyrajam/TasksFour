package com.task4;

import java.util.HashMap;

class GradeBook {
    HashMap<String, Integer> studentGrades = new HashMap<>();

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s Grade: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }
}

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gb = new GradeBook();
        gb.addStudent("Ravi", 90);
        gb.addStudent("Priya", 85);
        gb.displayGrade("Ravi");
        gb.removeStudent("Ravi");
        gb.displayGrade("Priya");
    }
}
