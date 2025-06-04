package CodingUsingJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("cd","cl","dg","dl", "ef","cl","dg");
		
		List<String> lising = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("remove duplicates"+ lising );
		
	
	}
}
