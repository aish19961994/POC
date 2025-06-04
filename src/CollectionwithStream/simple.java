package CollectionwithStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class simple {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<String> names = Arrays.asList("Ashish", "Neha", "Amit");
		
		
		
		List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

         System.out.println("Even numbers: " + evenNumbers);  
         
         
         
           List<String> upper = names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());

           System.out.println("Uppercase names: " + upper); 
           
           
           
           long count = names.stream().count();

           System.out.println("Total elements: " + count); 
           
           
           List<String> filtered = names.stream()
                   .filter(name -> name.startsWith("A"))
                   .collect(Collectors.toList());

           System.out.println("Names starting with 'A': " + filtered); 
           
           
           
           Optional<Integer> max = numbers.stream()
                   .max(Integer::compareTo);

          max.ifPresent(m -> System.out.println("Maximum number: " + m));  

	}

}
