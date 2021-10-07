import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
	FizzBuzz testee = new FizzBuzz();

	@Test
	public void returnsFizzWhenMultipleOf3AndBuzzWhenMultipleOf5AndFizzBuzzWhenMultipleOf15() {
		List<String> expectedResult = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz");

		List<String> actual = testee.fizzBuzz().subList(0,20);
		assertEquals( expectedResult , actual);
	}

}
