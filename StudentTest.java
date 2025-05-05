package com.task4;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21)
            throw new AgeNotWithinRangeException("Age is not within 15 to 21");

        if (!name.matches("[a-zA-Z ]+"))
            throw new NameNotValidException("Name contains invalid characters");

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Ramesh123", 17, "B.Tech");
            //Student s1 = new Student(102, "Ramesh", 8, "B.E");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
