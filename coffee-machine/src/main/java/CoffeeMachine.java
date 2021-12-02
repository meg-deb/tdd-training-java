import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        UserInputParser parser = new UserInputParser(new Scanner(System.in));
        DrinkMaker drinkMaker = new DrinkMaker(new CommunicatorWithTheUser());
        CreditChecker creditChecker = new CreditChecker();
        CoffeeMachineService coffeeMachineService = new CoffeeMachineService(parser, creditChecker, drinkMaker);
        coffeeMachineService.run();
    }
}