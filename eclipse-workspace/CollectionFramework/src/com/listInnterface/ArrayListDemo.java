package com.listInnterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"A");
		Student s2=new Student(2,"B");
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		Iterator i=list.iterator();
		
		while(i.hasNext()) {
			Student s=(Student)i.next();
			System.out.println("Student id : "+s.getSid());
			System.out.println("Student name : "+s.getName());
		}
	}
}
