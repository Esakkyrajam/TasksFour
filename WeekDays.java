package com.task4;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");
        try {
            int index = sc.nextInt();
            System.out.println("Day: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a number between 0 and 6");
        }
    }
}
