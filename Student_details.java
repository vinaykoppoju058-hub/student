package com.student;
import java.util.Scanner;
public class Student_details {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter student Id:");
		int stdID= sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String stdName= sc.next();
		
		System.out.println("Enter Student Age");
		int stdAge= sc.nextInt();
		
		System.out.println("Enter course:");
		String course=sc.next();
		
		System.out.println("student details:");
		System.out.println("=====================");
		System.out.println("student ID:"+stdID);
		System.out.println("student Name:"+stdName);
		System.out.println("student Age:"+stdAge);
		System.out.println("course:"+course);
	}

}
