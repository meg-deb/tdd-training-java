import models.DrinkName;

public class CoffeeMachineService {

    private final UserInputService parser;
    private final CreditChecker creditChecker;
    private final DrinkMaker drinkMaker;

    public CoffeeMachineService(UserInputService userInputService, CreditChecker creditChecker, DrinkMaker drinkMaker) {
        this.parser = userInputService;
        this.creditChecker = creditChecker;
        this.drinkMaker = drinkMaker;
    }

    public void run() {
        double userCredit = parser.getCredit();
        DrinkName drinkToMake = parser.getDrinkType();

        boolean isEnoughMoneyForDrink = creditChecker.isEnoughMoneyForDrink(userCredit, drinkToMake);

        if(isEnoughMoneyForDrink) { //TODO extract to method
            if (drinkToMake == DrinkName.TEA) {
                drinkMaker.make("T::");
            } else if (drinkToMake == DrinkName.HOT_CHOCOLATE) {
                drinkMaker.make("H::");
            } else {
                drinkMaker.make("C::");
            }
        }
        else {
            drinkMaker.make("M:Not enough money for drink.");
        }
    }
}
