import models.DrinkName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static models.DrinkName.*;

public class CoffeeMachine {

    public static void main(String[] args) {

        List<Integer> userInput = new ArrayList<Integer>();
//        TODO I NEED TUPLE HERE!!!

        private List<Integer> getUserInput() {


            Scanner scannerForInput = new Scanner(System.in);
            System.out.println("Welcome to Coffee Machine!\n" +
                    "Available drinks:\n" +
                    "Number 1: Tea - 0,4 euro,\n" +
                    "Number 2: Hot chocolate - 0,5 euro,\n" +
                    "Number 3: Coffee - 0,6 euro.\n\n" +
                    "Please give credit for drink:");

            int userCredit = Integer.parseInt(scannerForInput.nextLine());
            System.out.println("Thank you. Your credit is: " + userCredit + "\u20ac\n");

            System.out.println("Please choose number of your drink:");
            int userDrinkNumber = Integer.parseInt(scannerForInput.nextLine());

            DrinkName drinkToMake;
            if (userDrinkNumber == 1) {
                drinkToMake = TEA;
            } else if (userDrinkNumber == 2) {
                drinkToMake = HOT_CHOCOLATE;
            } else if (userDrinkNumber == 3) {
                drinkToMake = COFFEE;
            } else {
                System.out.println("Invalid number chosen.");
                return;
            }
            System.out.println("Thank you. Drink you chose is: " + drinkToMake);

            userInput.add(userCredit);
            userInput.add(drinkToMake);
        }

//        drinkToMake = user chooses what drink to do
//
//        isDrinkMakerDoDrink? = creditChecker(money, drinkToMake)
//                if yes :
//        drink = drinkMaker("T:1:0");
    }
}
