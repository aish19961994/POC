package CollectionwithStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Difficult {
	
	public static void main(String[] args) {
		
		 // Q1: How to remove duplicates from a list using Java 8 Stream?
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique elements: " + unique);

        
        
        // Q2: How to count the frequency of elements in a list?
        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Frequency count: " + frequency);

        
        
        // Q3: How to find the first non-repeated character in a String?
        String input = "streamexample";
        Optional<Character> firstNonRepeat = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println("First non-repeated character: " + firstNonRepeat.orElse(null));

        
        
        // Q4: How to sort a Map by value?
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);

        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Sorted Map by value: " + sortedMap);

        
        
        
        // Q5: How to merge two lists without duplicates?
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("B", "C", "D");
        List<String> merged = Stream.concat(list1.stream(), list2.stream())
                .distinct().collect(Collectors.toList());
        System.out.println("Merged list without duplicates: " + merged);
    }
	}


