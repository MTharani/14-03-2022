package com.encapsulation;

import java.util.Scanner;

class Student
{
	//instance variable
	int stud_id;
	String stud_name;
	double stud_fee;
	int stud_age;
	
	// member method or function
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student id:");
		stud_id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the student name:");
		stud_name=sc.nextLine();
		System.out.print("Enter the student fees:");
		stud_fee=sc.nextDouble();
		System.out.print("Enter the Student age:");
		stud_age=sc.nextInt();
	}
	void display()
	{
		System.out.println("STUDENT DETAILS");
		System.out.println("The Student id is:    "+stud_id);
		System.out.println("The Student name is:  "+stud_name);
		System.out.println("The Student fee is:   "+stud_fee);
		System.out.println("The Student age is:    "+stud_age);
	}
}
//main class
public class StudentDetails 
{

	public static void main(String[] args) 
	{
		// main method-starting point of programming
		Student s=new Student();
		s.input();
		s.display();

	}

}
