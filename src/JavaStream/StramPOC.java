package JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StramPOC {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
	            new Employee(101, "John", "HR", 60000),
	            new Employee(102, "Ashish", "IT", 80000),
	            new Employee(103, "Sagar", "IT", 75000),
	            new Employee(104, "utkarsh", "Finance", 65000),
	            new Employee(105, "saurabh", "HR", 58000)
	        );

	        // 1️ Filter employees with salary > 60000
	        List<Employee> highEarners = employees.stream()
	            .filter(emp -> emp.getSalary() > 60000)
	            .collect(Collectors.toList());
	        System.out.println("High Earners: " + highEarners);

	        // 2  Get names of all employees (map)
	        List<String> names = employees.stream()
	            .map(Employee::getName)
	            .collect(Collectors.toList());
	        System.out.println("Employee Names: " + names);

	        // 3️ Find total salary of all employees (reduce)
	        double totalSalary = employees.stream()
	            .map(Employee::getSalary)
	            .reduce(0.0, Double::sum);
	        System.out.println("Total Salary: " + totalSalary);

	        // 4️ Group employees by department
	        Map<String, List<Employee>> deptGroup = employees.stream()
	            .collect(Collectors.groupingBy(Employee::getDepartment));
	        System.out.println("Grouped by Department: " + deptGroup);

	        // 5️ Average salary per department
	        Map<String, Double> avgDeptSalary = employees.stream()
	            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	        System.out.println("Avg Salary by Dept: " + avgDeptSalary);

	        // 6️ Highest salary employee
	        Employee maxSalaryEmp = employees.stream()
	            .max(Comparator.comparing(Employee::getSalary))
	            .orElse(null);
	        System.out.println("Highest Earner: " + maxSalaryEmp);

	        // 7️ FlatMap example – skills across employees
	        List<List<String>> skillLists = Arrays.asList(
	            Arrays.asList("Java", "Spring"),
	            Arrays.asList("Python", "Django"),
	            Arrays.asList("JavaScript", "React")
	        );

	        List<String> allSkills = skillLists.stream()
	            .flatMap(List::stream)
	            .distinct()
	            .collect(Collectors.toList());
	        System.out.println("All Skills: " + allSkills);
	                
	                
	                
	                
	}

}
