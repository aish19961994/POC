package CodingUsingJava8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeative {
	
	String input = "javardeveloper";
	
	Character result = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
			        .entrySet().stream()
			        .filter(e -> e.getValue()==1)
			        .map(Map.Entry::getKey)
			        .findAny().orElse(null);
	

}
