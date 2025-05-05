package com.task4;
class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18)
            throw new InvalidVoterAgeException("Invalid age for voter");
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

public class VoterTest {
    public static void main(String[] args) {
        try {
            Voter v = new Voter(1, "Kumar", 16);
        } catch (InvalidVoterAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
