import models.DrinkName;

public class CreditChecker {

    public boolean isEnoughMoneyForDrink(double money, DrinkName drinkName) {
        switch (drinkName){
            case TEA:
                return money >= Tea.PRICE;
            case HOT_CHOCOLATE:
                return money >= HotChocolate.PRICE;
            case COFFEE:
                return money >= Coffee.PRICE;
        }
    }
}
