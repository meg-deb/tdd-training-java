import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<String> fizzBuzz() {

        return IntStream.range(1, 100).boxed()
                .map(number -> {
                    if (number % 15 == 0) {
                        return "FizzBuzz";
                    } else if (number % 3 == 0) {
                        return "Fizz";
                    } else if (number % 5 == 0) {
                        return "Buzz";
                    } else {
                        return String.valueOf(number);
                    }
                }).collect(Collectors.toList());
    }
}

//1 while loop
//2 for //2* for over list
//3 forEach
//4 iterator
//5 streams API