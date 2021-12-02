import models.DrinkName;

public class CoffeeMachineService {

    private final UserInputParser parser;
    private final CreditChecker creditChecker;
    private final DrinkMaker drinkMaker;

    public CoffeeMachineService(UserInputParser userInputParser, CreditChecker creditChecker, DrinkMaker drinkMaker) {
        this.parser = userInputParser;
        this.creditChecker = creditChecker;
        this.drinkMaker = drinkMaker;
    }

    public void run() {
        double userCredit = parser.getCredit();
        DrinkName drinkToMake = parser.getDrinkType();

        boolean isEnoughMoneyForDrink = creditChecker.isEnoughMoneyForDrink(userCredit, drinkToMake);

        if(isEnoughMoneyForDrink) {
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
