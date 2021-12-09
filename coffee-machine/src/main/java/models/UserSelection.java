package models;

public class UserSelection {
    private final double userCredit;
    private final DrinkName drinkToMake;
    private final int sugar;

    public UserSelection(double userCredit, DrinkName drinkToMake, int sugar) {
        this.userCredit = userCredit;
        this.drinkToMake = drinkToMake;
        this.sugar = sugar;
    }

    public double getUserCredit() {
        return userCredit;
    }

    public DrinkName getDrinkToMake() {
        return drinkToMake;
    }

    public int getSugar() {
        return sugar;
    }
}
