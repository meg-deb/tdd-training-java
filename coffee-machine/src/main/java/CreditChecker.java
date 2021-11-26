import models.DrinkName;

public class CreditChecker {

    public boolean isEnoughMoneyForDrink(double money, DrinkName drinkName) {
        if (drinkName.equals(DrinkName.TEA)) {
            return money >= Tea.PRICE;
        }
        else if (drinkName.equals(DrinkName.HOT_CHOCOLATE)) {
            return money >= HotChocolate.PRICE;
        }
        return money >= Coffee.PRICE;
    }
}
