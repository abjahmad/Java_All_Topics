package java8_Logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
									//This creates an immutable list list with some duplicate values: 
									//{1, 23, 455, 22, 23, 1, 44, 55, 44, 22}.
		List<Integer> list = Arrays.asList(1, 23, 455, 22, 23, 1, 44, 55, 44, 22);
								// list.stream() Converts the list into a stream, 
								//	allowing us to perform operations on its elements.	
		Set<Integer> duplicate = list.stream()
							//This method counts how many times e appears in list.	
				.filter(e -> Collections.frequency(list, e) > 1)
				//Converts filtered elements into a Set<Integer>.	
				.collect(Collectors.toSet());
		System.out.println(duplicate);
	}
}
