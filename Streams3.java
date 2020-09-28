//Stream filter() with multiple conditions
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("red", "blue", "orange", "yellow", "black");

		List<String> longnames = names.stream().filter(str -> str.length() > 5 || str.length() < 4)
				.collect(Collectors.toList());
		longnames.forEach(System.out::println);

	}

}