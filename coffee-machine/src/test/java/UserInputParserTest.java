import models.DrinkName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class UserInputParserTest {

    @Test
    public void shouldReturnInt1AsCreditWhenUserInput1(){
        String userInput = "1";
        UserInputParser testee = new UserInputParser(new Scanner(userInput));
        int expectedCredit = 1;

        double credit = testee.getCredit();

        assertThat(credit).isEqualTo(expectedCredit);
    }

    @Test
    public void shouldReturnDouble06AsCreditWhenUserInput06(){
        String userInput = "0.6";
        UserInputParser testee = new UserInputParser(new Scanner(userInput));
        double expectedCredit = 0.6;

        double credit = testee.getCredit();

        assertThat(credit).isEqualTo(expectedCredit);
    }

    @Test
    public void shouldReturnTeaAsDrinkTypeFromUserInput1(){
        String userInput = "1";
        UserInputParser testee = new UserInputParser(new Scanner(userInput));
        DrinkName expectedDrink = DrinkName.TEA;

        DrinkName drinkToMake = testee.getDrinkType();

        assertThat(drinkToMake).isEqualTo(expectedDrink);
    }

    @Test
    public void shouldReturnHotChocolateAsDrinkTypeFromUserInput2(){
        String userInput = "2";
        UserInputParser testee = new UserInputParser(new Scanner(userInput));
        DrinkName expectedDrink = DrinkName.HOT_CHOCOLATE;

        DrinkName drinkToMake = testee.getDrinkType();

        assertThat(drinkToMake).isEqualTo(expectedDrink);
    }

    @Test
    public void shouldReturnCoffeeAsDrinkTypeFromUserInput3(){
        String userInput = "3";
        UserInputParser testee = new UserInputParser(new Scanner(userInput));
        DrinkName expectedDrink = DrinkName.COFFEE;

        DrinkName drinkToMake = testee.getDrinkType();

        assertThat(drinkToMake).isEqualTo(expectedDrink);
    }

}