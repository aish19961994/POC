package CollectionwithStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import JavaStream.Employee;

public class StreamModerateExamples {
	

	public static void main(String[] args) {

        // Question 1: Group strings by length
        List<String> words = Arrays.asList("Java", "Spring", "Stream", "API", "JPA");
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("1️⃣ Grouped by length: " + groupedByLength);


        // Employee List for Q2
        List<StreamModerateExamples> employees = Arrays.asList(
            new StreamModerateExamples(1, "Ashish", 32, 80000, "IT"),
            new StreamModerateExamples(2, "Neha", 28, 70000, "HR"),
            new StreamModerateExamples(3, "Amit", 31, 75000, "Finance"),
            new StreamModerateExamples(4, "Sneha", 26, 72000, "IT"),
            new StreamModerateExamples(5, "Rahul", 35, 95000, "Admin")
        );

        // Question 2: Find names of employees older than 30
        List<String> over30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .map(StreamModerateExamples::getName)
                .collect(Collectors.toList());
        System.out.println("2️⃣ Employees older than 30: " + over30);


        // Question 3: Remove duplicate elements from a list
        List<String> names = Arrays.asList("Ashish", "Neha", "Ashish", "Amit", "Neha");
        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("3️⃣ Unique names: " + uniqueNames);


        // Question 4: Sort a list of strings in reverse order
        List<String> sortedReverse = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("4️⃣ Sorted in reverse: " + sortedReverse);


        // Question 5: Find the second highest number
        List<Integer> numbers = Arrays.asList(10, 50, 30, 40, 20);
        Optional<Integer> secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighest.ifPresent(val -> System.out.println("5️⃣ Second highest number: " + val));
    }

}
