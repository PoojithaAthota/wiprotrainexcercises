
package com.wipro.collections;

import java.util.*;

public class Employeesort {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        
        employee.add(new Employee("101", "Pooji", 20, 5000));
        employee.add(new Employee("102", "Ashok", 25, 7500));
        employee.add(new Employee("103", "Bhanu", 23, 4500));
        

       
        Collections.sort(employee, new SortByEmpId());
        employee.forEach(System.out::println);
        System.out.println("-------------------------------");
      
        Collections.sort(employee, new SortByEmpName());
        employee.forEach(System.out::println);
        System.out.println("-------------------------------");

        
        Collections.sort(employee, new SortByEmpAge());
        employee.forEach(System.out::println);
        System.out.println("-------------------------------");
        
        Collections.sort(employee, new SortByEmpSalary());
        employee.forEach(System.out::println);
        
        
        
    }
}
