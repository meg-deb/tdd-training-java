import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        UserInputService parser = new UserInputService(new Scanner(System.in));
        DrinkMaker drinkMaker = new DrinkMaker(new CommunicatorWithTheUser());
        CreditChecker creditChecker = new CreditChecker();
        CoffeeMachineService coffeeMachineService = new CoffeeMachineService(parser, creditChecker, drinkMaker);
        coffeeMachineService.run();
    }
}