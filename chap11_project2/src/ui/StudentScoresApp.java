package ui;

import java.util.Arrays;

import business.Student;
import util.Console;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Scores application\n");
		
		int nbrOfStudents = Console.getInt("Number of students: ", 0, 501);
		
		Student[] students = new Student[nbrOfStudents];
		
		for (int i=0; i < students.length; i++) {
			System.out.println("\nSTUDENT " + (i+1));
			String lastName = Console.getStringNotEmpty("Enter last name: ");
			String firstName = Console.getStringNotEmpty("Enter first name: ");
			int grade = Console.getInt("Score: ", -1, 101);
			
			Student student = new Student(lastName, firstName, grade);
			
			students[i] = student;
		}
		
		//biz logic
		Arrays.sort(students);
		
		System.out.println("\nSUMMARY");
		for (Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("\nGoodbye!");
	}

}
