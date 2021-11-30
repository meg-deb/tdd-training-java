import models.DrinkName;

public class CoffeeMachineService {

    private final UserInputParser parser;
    private final DrinkMaker drinkMaker;

    public CoffeeMachineService(UserInputParser userInputParser, DrinkMaker drinkMaker) {
        this.parser = userInputParser;
        this.drinkMaker = drinkMaker;
    }

    public void run() {
        DrinkName drinkToMake = parser.getDrinkType();

        if (drinkToMake == DrinkName.TEA) {
            drinkMaker.make("T::");
        } else if (drinkToMake == DrinkName.HOT_CHOCOLATE) {
            drinkMaker.make("H::");
        } else {
            drinkMaker.make("C::");
        }
    }
}
