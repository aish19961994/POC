package CodingUsingJava8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {
	public static void main(String[] args) {
		
     List<String> names  = List.of("utkarsh","Ashish","Sagar","utkarsh","Sagar") ;
     
      Set<String> list = new HashSet<>();
      
      Set<String> duplicates = names.stream().filter(name ->!list.add(name)).collect(Collectors.toSet());
      
      System.out.println("duplicates :-"+duplicates);
     
	}

}
