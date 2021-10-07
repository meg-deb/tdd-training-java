
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz() {
        List<String> result = new java.util.ArrayList<>();

        for(int x = 0; x < 100; x++){
            int number = x + 1;
            String stringNumber = String.valueOf(number);
            if(number % 15 == 0){
                result.add("FizzBuzz");
            }
            else if(number % 3 == 0){
                result.add("Fizz");
            }
            else if(number % 5 == 0){
                result.add("Buzz");
            }
            else {
                result.add(stringNumber);
            }
        }

        return result;
    }
}