package com.mapDemo;

import java.util.LinkedHashMap;

public class MapDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create Student
		Student s1=new Student(1,"S1");
		Student s2=new Student(2,"S2");
		Student s3=new Student(3,"S3");
		Student s4=new Student(3,"S3");
		
		//Create empty map
		
		LinkedHashMap<Student,String> map=new LinkedHashMap<>();
		
		map.put(s1, "student1");
		map.put(s2, "student2");
		map.put(s3, "student3");
		map.put(s4,"student3");
		
		System.out.println(map);
		
	}

}
