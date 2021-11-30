import models.DrinkName;

import java.util.Scanner;

import static models.DrinkName.*;

public class UserInputParser{
    private final Scanner scanner;

    public UserInputParser(Scanner scanner){
        this.scanner = scanner;
    }

    public DrinkName getDrinkType() {
        System.out.println("Welcome to Coffee Machine!\n" +
                "Available drinks:\n" +
                "Number 1: Tea - 0,4 euro,\n" +
                "Number 2: Hot chocolate - 0,5 euro,\n" +
                "Number 3: Coffee - 0,6 euro.\n\n" +
                "Please choose number of your drink:");
        int userDrinkNumber = scanner.nextInt();

        DrinkName drinkToMake;
        if (userDrinkNumber == 1) {
            drinkToMake = TEA;
        } else if (userDrinkNumber == 2) {
            drinkToMake = HOT_CHOCOLATE;
        } else if (userDrinkNumber == 3) {
            drinkToMake = COFFEE;
        } else {
            System.out.println("Invalid number chosen.");
            return null;
        }
        System.out.println("Thank you. Drink you chose is: " + drinkToMake);
        return drinkToMake;
    }
}
