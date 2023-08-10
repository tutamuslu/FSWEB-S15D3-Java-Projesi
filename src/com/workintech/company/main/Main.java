package com.workintech.company.main;

import com.workintech.company.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan", "Kınık"));
        employees.add(new Employee(1, "Dogancan", "Kınık"));
        employees.add(new Employee(2, "Tugba", "Muslu"));
        employees.add(new Employee(2, "Tugba", "Muslu"));
        employees.add(new Employee(3, "Muhammet", "Muslu"));
        employees.add(new Employee(3, "Muhammet", "Muslu"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if(employeeMap.containsKey(employee.getId())); {
                removedEmployees.add(employee);
            } else {
                    employeeMap.put(employee.getId(), employee);
                }
        }
        for(Employee employee: removedEmployees){
            employees.remove(employee);
        }
        System.out.println(employees);
        System.out.println(employeeMap);

    }
}