package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Maindriver {

	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Yogi",150000);
		Employee e2 =new Employee(2,"Akhilesh",100000);
		
		ArrayList<Employee> list =new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		
		//Before Sorting
		System.out.println(list);
		
		//After Sorting
		Collections.sort(list,new SortBySalary());
		System.out.println(list);
		
		//sorting by Name
		Collections.sort(list,new SortByName());
		System.out.println(list);
		
	}
}
