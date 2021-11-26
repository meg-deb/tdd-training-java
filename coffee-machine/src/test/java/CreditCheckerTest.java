import org.junit.jupiter.api.Test;

import static models.DrinkName.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CreditCheckerTest {

    CreditChecker testCreditChecker = new CreditChecker();

    @Test
    public void shouldReturnTrueIfAmountOfMoneyForTeaIsTheSame(){
        double money = 0.4;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, TEA);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnFalseIfAmountOfMoneyForTeaIsNotEnough(){
        double money = 0.0;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, TEA);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldReturnTrueIfAmountOfMoneyForTeaIsTooMuch(){
        double money = 1.0;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, TEA);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnTrueIfAmountOfMoneyForCoffeeIsTheSame(){
        double money = 0.6;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, COFFEE);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnFalseIfAmountOfMoneyForCoffeeIsNotEnough(){
        double money = 0.0;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, COFFEE);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldReturnTrueIfAmountOfMoneyForCoffeeIsTooMuch(){
        double money = 1.0;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, COFFEE);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnTrueIfAmountOfMoneyForHotChocolateIsTheSame(){
        double money = 0.5;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, HOT_CHOCOLATE);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnFalseIfAmountOfMoneyForHotChocolateIsNotEnough(){
        double money = 0.0;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, HOT_CHOCOLATE);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldReturnTrueIfAmountOfMoneyForHotChocolateIsTooMuch(){
        double money = 1.0;
        boolean result = testCreditChecker.isEnoughMoneyForDrink(money, HOT_CHOCOLATE);

        assertThat(result).isTrue();
    }

}
