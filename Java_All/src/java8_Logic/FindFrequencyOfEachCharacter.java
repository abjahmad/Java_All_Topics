package java8_Logic;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacter {
	public static void main(String[] args) {
		String str = "I am Arbaj Ahmad";
		
		Map<Character, Long> charCount = str.chars()
										.mapToObj(c -> (char) c)
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
	}

}
