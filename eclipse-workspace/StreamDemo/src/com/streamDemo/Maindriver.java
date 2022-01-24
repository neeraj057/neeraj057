package com.streamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Maindriver {

	
	
	public static void main(String[] args) {
		
		//play with integer value
		
		
		Employee e1=new Employee(1,"Yogi",15000);
		Employee e2 =new Employee(2,"Akhilesh",10000);
		Employee e3 =new Employee(3,"Rahul",5000);
		
		ArrayList<Employee> list =new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		//List<Employee> newList =list.stream().filter(x->x.getSalary()<=10000).collect(Collectors.toList());
		//System.out.println(newList);
		
		//print name and id whose salary is less than 10000
//		List<String>newList=list.stream().filter(e->e.getSalary()<=10000).map(e->e.getName()+" "+e.getEid()).collect(Collectors.toList());
//		System.out.println(newList);
		
		//use of min and max function of Stream
		//min method return Optional class and once get optional class we can use get() method
		//of Optional class
//		Employee emp=list.stream().min((o1,o2)->o1.getSalary()-o2.getSalary()).get();
//		System.out.println(emp);
//		
		
		//Sort Employee as per salary
		List<Employee> sortedEmployee =list.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).collect(Collectors.toList());
		System.out.println(sortedEmployee);
	}
}
