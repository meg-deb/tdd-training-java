import models.DrinkName;

import java.util.Scanner;

import static models.DrinkName.*;

public class UserInputService {
    private final Scanner scanner;

    public UserInputService(Scanner scanner){
        this.scanner = scanner;
    }
    //TODO private methods

    public double getCredit() {
        System.out.println("Welcome to Coffee Machine!\n" +
                "Available drinks:\n" +
                "Number 1: Tea - 0.4 euro,\n" +
                "Number 2: Hot chocolate - 0.5 euro,\n" +
                "Number 3: Coffee - 0.6 euro.\n\n" +
                "Please give credit for drink:");

        double userCredit = scanner.nextDouble();
        System.out.println("Thank you. Your credit is: " + userCredit + "\u20ac\n");
        return userCredit;
    }

    public DrinkName getDrinkType() {
        System.out.println("Please choose number of your drink:");
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
