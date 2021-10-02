public class FizzBuzz {

    public String fizzBuzz(int i) {
        boolean isMultipleOf15 = i % 15 == 0;
        boolean isMultipleOf3 = i % 3 == 0;
        boolean isMultipleOf5 = i % 5 == 0;
        if(isMultipleOf15){
            return "FizzBuzz";
        }
        else if(isMultipleOf3){
                return "Fizz";
            }
        else if(isMultipleOf5){
                return "Buzz";
            }
        return String.valueOf(i);
    }
}
