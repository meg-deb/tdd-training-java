import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
	FizzBuzz testee = new FizzBuzz();

	@Test
	public void returnsFizzWhenMultipleOf3AndBuzzWhenMultipleOf5() {
		List<String> expectedResult = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz", "16", "17", "Fizz", "19", "Buzz");

		List<String> actual = testee.fizzBuzz().subList(0,20);
		assertEquals( expectedResult , actual);
	}
//
//	@Test
//	public void returnsFizzBuzzWhenMultipleOf15() {
//		String result = testee.fizzBuzz(15);
//		assertEquals("FizzBuzz",result);
//
//		String result2 = testee.fizzBuzz(30);
//		assertEquals("FizzBuzz",result2);
//	}

}
