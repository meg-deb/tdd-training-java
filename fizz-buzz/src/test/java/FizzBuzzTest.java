import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
	FizzBuzz testee = new FizzBuzz();

	@Test
	public void returnsNumberIfNotMultipleOf3() {
		String result = testee.fizzBuzz(2);
		assertEquals("2",result);
		String result2 = testee.fizzBuzz(7);
		assertEquals("7",result2);
	}

	@Test
	public void returnsFizzWhenMultipleOf3() {
		String result = testee.fizzBuzz(3);
		assertEquals("Fizz",result);

		String result2 = testee.fizzBuzz(9);
		assertEquals("Fizz",result2);
	}

	@Test
	public void returnsBuzzWhenMultipleOf5() {
		String result = testee.fizzBuzz(5);
		assertEquals("Buzz",result);

		String result2 = testee.fizzBuzz(10);
		assertEquals("Buzz",result2);
	}

	@Test
	public void returnsFizzBuzzWhenMultipleOf15() {
		String result = testee.fizzBuzz(15);
		assertEquals("FizzBuzz",result);

		String result2 = testee.fizzBuzz(30);
		assertEquals("FizzBuzz",result2);
	}

}
