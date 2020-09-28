
//grouping the elements of a list and printing the occurrences of each element in the list
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams4 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("apple", "mango", "orange", "apple", "mango", "apple");
		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}
}