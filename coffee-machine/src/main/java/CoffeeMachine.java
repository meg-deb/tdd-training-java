import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scannerForInput = new Scanner(System.in);
        System.out.println("Welcome to Coffee Machine!\n" +
                "Available drinks:\n" +
                "Tea - 0,4 euro,\n" +
                "Hot chocolate - 0,5 euro,\n" +
                "Coffee - 0,6 euro.\n\n" +
                "Please give credit for drink:");

        String userCredit = scannerForInput.nextLine();
        System.out.println("Thank you. Your credit is: " + userCredit + "\u20ac");

//        drinkToMake = user chooses what drink to do
//
//        isDrinMakerDoDrink? = creditChecker(money, drinkToMake)
//                if yes :
//        drink = drinkMaker("T:1:0");
    }
}
