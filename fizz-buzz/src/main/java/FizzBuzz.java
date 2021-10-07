import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz() {
//        boolean isMultipleOf15 = i % 15 == 0;
//        boolean isMultipleOf3 = i % 3 == 0;
//        boolean isMultipleOf5 = i % 5 == 0;
//        if(isMultipleOf15){
//            return "FizzBuzz";
//        }
//        else if(isMultipleOf3){
//                return "Fizz";
//            }
//        else if(isMultipleOf5){
//                return "Buzz";
//            }
//        return String.valueOf(i);
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
//could have 3 conditions in ternary but not sure if clean?