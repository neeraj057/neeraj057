package com.mapDemo;
import java.util.*;
import java.util.stream.Collectors;

public class MainStreamDemo {
	public static void main(String args[])
	{
		List<Student> listOfStudents = createListOfStudents();
		
		// Using map function to convert Stream<Student> to Stream<String>
		List<String> listOfStudentNames=listOfStudents.stream().map(s -> s.getName()) .collect(Collectors.toList());
		listOfStudentNames.forEach(System.out::println);
	}		
	
	public static List<Student> createListOfStudents()
	{
		List<Student> listOfStudents=new ArrayList<>();
		Student s1= new Student("Anchit",20);
		Student s2= new Student("Peter",19);
		Student s3= new Student("Martin",22);
		Student s4= new Student("Sam",21);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		return listOfStudents;
	}
}
