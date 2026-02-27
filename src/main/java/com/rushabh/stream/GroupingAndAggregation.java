package com.rushabh.stream;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupingAndAggregation {
  public static void main() {
    List<Employee> employees =
        Arrays.asList(
            new Employee(1, "Abraham", 29, "IT", "Mumbai", 51000, "Male"),
            new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
            new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
            new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
            new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
            new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
            new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male"));

    // Calculate highest salary among employees
    employees.stream()
        .max(Comparator.comparing(Employee::getSalary))
        .ifPresent(
            employee ->
                System.out.println(
                    "Employee with the highest salary: "
                        + employee.getName()
                        + " - "
                        + employee.getSalary()));

    // Average salary per department
    Map<String, Double> avgSalaryByDept =
        employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartNames,
                    Collectors.averagingDouble(
                        Employee::getSalary))); // {IT=75000.0, HR=52000.0, Finance=61000.0}

    // 10. Partition employees by salary above/below 50000
    Map<Boolean, List<Employee>> partitioned =
        employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));

    List<Employee> highEarners = partitioned.get(true);
    List<Employee> lowEarners = partitioned.get(false);

    CopyOnWriteArraySet<Integer> list = new CopyOnWriteArraySet<>();
    list.addAll(List.of(1, 2, 3, 4));
    Predicate<Integer> p =
        n -> {
          list.add(100); // This should be safe
          return n % 2 == 0;
        };
    list.removeIf(p); // This should succeed

    // System.out.println(list);
    // System.out.println(highEarners);
  }
}
