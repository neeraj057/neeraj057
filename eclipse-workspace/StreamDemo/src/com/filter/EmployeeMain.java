package com.filter;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
 
    public static void main(String[] args)
    {
        List<Employee> employeeList = createEmployeeList();
        List<String> filterEmployeeByAge = filterEmployeeByAge(employeeList);
        System.out.println("Filtered list of employees using conventional way:");
        for (String employeeName:filterEmployeeByAge) {
            System.out.println(employeeName);
        }
 
        System.out.println("================================");
        System.out.println("Filtered list of employees using Stream : ");
        List<String> filterEmployeeByAgeWithStream = filterEmployeeByAgeWithStream(employeeList);
        for (String employeeName:filterEmployeeByAgeWithStream) {
            System.out.println(employeeName);
        }
    }
 
    public static List<String> filterEmployeeByAge(List<Employee> employeeList)
    {
        // Using conventional way
        List<String> employeeFilteredList=new ArrayList<>();
        for(Employee e:employeeList)
        {
            if(e.getAge()>20)
            {
                employeeFilteredList.add(e.getName());
            }
        }
        return employeeFilteredList;
    }
    public static List<String> filterEmployeeByAgeWithStream(List<Employee> employeeList)
    {
        // Using Java 8 Stream
        List<String> employeeFilteredList = employeeList.stream()
                  .filter(e->e.getAge()>20)
                  .map(Employee::getName)
                  .collect(Collectors.toList());
        return employeeFilteredList;
    }
    public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();
 
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
 
        return employeeList;
    }
}