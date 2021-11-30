import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        UserInputParser parser = new UserInputParser(new Scanner(System.in));
        DrinkMaker drinkMaker = new DrinkMaker(new CoffeeMachineUI());
        CoffeeMachineService coffeeMachineService = new CoffeeMachineService(parser, drinkMaker);
        coffeeMachineService.run();



//        Scanner scannerForInput = new Scanner(System.in);
//        System.out.println("Welcome to Coffee Machine!\n" +
//                "Available drinks:\n" +
//                "Number 1: Tea - 0,4 euro,\n" +
//                "Number 2: Hot chocolate - 0,5 euro,\n" +
//                "Number 3: Coffee - 0,6 euro.\n\n" +
//                "Please give credit for drink:");
//
//        int userCredit = scannerForInput.nextInt();
//        System.out.println("Thank you. Your credit is: " + userCredit + "\u20ac\n");
//
//        System.out.println("Please choose number of your drink:");
//        int userDrinkNumber = scannerForInput.nextInt();
//
//        DrinkName drinkToMake;
//        if (userDrinkNumber == 1) {
//            drinkToMake = TEA;
//        } else if (userDrinkNumber == 2) {
//            drinkToMake = HOT_CHOCOLATE;
//        } else if (userDrinkNumber == 3) {
//            drinkToMake = COFFEE;
//        } else {
//            System.out.println("Invalid number chosen.");
//            return;
//        }
//        System.out.println("Thank you. Drink you chose is: " + drinkToMake);

    }
}



//        drinkToMake = user chooses what drink to do
//
//        isDrinkMakerDoDrink? = creditChecker(money, drinkToMake)
//                if yes :
//        drink = drinkMaker("T:1:0");