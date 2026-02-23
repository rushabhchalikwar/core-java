package com.rushabh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Exercise1 {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
                    new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
                    new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
                    new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
                    new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
                    new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
                    new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
            );

            // Filter employees whose name starts with "A" and collect them into a list
            List<Employee> rName = employees.stream().map(employee -> {
                System.out.println("Mapping employee: " + employee.getName());
                return employee;
            }).
                    filter(employee-> {
                        System.out.println("Filtering employee: " + employee.getName());
                        return employee.getName().startsWith("A");}).toList();

            // Group employees by their department names and collect them into a map
            Map<String, List<Employee>> deptMap = employees.stream()
                    .collect(Collectors.groupingBy(emp -> emp.getDepartNames()));

            // Find the maximum age among the employees using reduce
            int maxAge = employees.stream().map(employee -> employee.getAge())
                            .reduce(0, (a, b) -> a > b ? a : b);

            // Get a list of distinct department names from the employees
            List<String> deptNames = employees.stream().map(employee -> employee.getDepartNames())
                    .distinct().toList();

            System.out.println(rName);
        }
}
