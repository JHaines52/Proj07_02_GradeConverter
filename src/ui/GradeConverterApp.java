package ui;

import java.util.Scanner;

import model.Grade;
import util.Console;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get numerical grade from user
            int number = Console.getInt("Enter numerical grade: ");
            Grade grade = new Grade(number);

            // display the result of the conversion
            System.out.println("Letter grade: " + grade.getLetter() + "\n");

            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
	}

}
