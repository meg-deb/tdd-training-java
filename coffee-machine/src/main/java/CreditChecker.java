public class CreditChecker {

    public boolean isExactMoneyForDrink(double money, Drink drinkToMake) {
        return money == drinkToMake.getPrice();
    }
}
