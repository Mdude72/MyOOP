package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        myGrade();
    }

    public static void myGrade() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many grades would you like to add?: ");

        int numberOfGrades = userInput.nextInt();

        int[] gradeArray = new int[numberOfGrades];

        // Adding grades to the grades Array
        for(int i = 0; i < gradeArray.length; i++) {
            System.out.println("HW" + (i+1) + " score: ");
            gradeArray[i] = userInput.nextInt();
        }

        // Initiating a sum for all the grades added
        int sum = 0;

        // Adding all grades
        for(int i = 0; i < gradeArray.length; i++) {
            sum += gradeArray[i];
        }

        System.out.println("sum is: " +sum);
        // Average of the homework(HW) grades
        double gradeAverage = sum/gradeArray.length;
        System.out.println("Average is: " + gradeAverage);

        int abvGrade = 0;

        // Showing how many grades are above the average
        for(int j = 0; j<gradeArray.length; j++) {
            if(gradeArray[j] > gradeAverage) {
                abvGrade ++;
            }
        }

        System.out.println("This is how many grades are above average: " + abvGrade);
    }
}
