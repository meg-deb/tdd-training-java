import models.DrinkName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CoffeeMachineServiceTest {

    @Test
    public void shouldRunAndMakeTea(){
        double userCredit = 1.0;
        DrinkName userDrink = DrinkName.TEA;
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getCredit()).thenReturn(userCredit);
        when(mockedUserInputParser.getDrinkType()).thenReturn(userDrink);

        CreditChecker mockedCreditChecker = mock(CreditChecker.class);
        when(mockedCreditChecker.isEnoughMoneyForDrink(userCredit, userDrink)).thenReturn(true);

        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedCreditChecker, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getCredit();
        verify(mockedUserInputParser).getDrinkType();
        verify(mockedCreditChecker).isEnoughMoneyForDrink(userCredit, userDrink);
        verify(mockedDrinkMaker).make("T::");
    }

    @Test
    public void shouldReturnMessageWhenNotEnoughCreditForTea(){
        double userCredit = 0;
        DrinkName userDrink = DrinkName.TEA;
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getCredit()).thenReturn(userCredit);
        when(mockedUserInputParser.getDrinkType()).thenReturn(userDrink);

        CreditChecker mockedCreditChecker = mock(CreditChecker.class);
        when(mockedCreditChecker.isEnoughMoneyForDrink(userCredit, userDrink)).thenReturn(false);

        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedCreditChecker, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getCredit();
        verify(mockedUserInputParser).getDrinkType();
        verify(mockedCreditChecker).isEnoughMoneyForDrink(userCredit, userDrink);
        verify(mockedDrinkMaker).make("M:Not enough money for drink.");
    }

    @Test
    public void shouldRunAndMakeChocolate(){
        double userCredit = 0.9;
        DrinkName userDrink = DrinkName.HOT_CHOCOLATE;
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getCredit()).thenReturn(userCredit);
        when(mockedUserInputParser.getDrinkType()).thenReturn(userDrink);

        CreditChecker mockedCreditChecker = mock(CreditChecker.class);
        when(mockedCreditChecker.isEnoughMoneyForDrink(userCredit, userDrink)).thenReturn(true);

        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedCreditChecker, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getCredit();
        verify(mockedUserInputParser).getDrinkType();
        verify(mockedCreditChecker).isEnoughMoneyForDrink(userCredit, userDrink);
        verify(mockedDrinkMaker).make("H::");
    }

    @Test
    public void shouldRunAndMakeCoffee(){
        double userCredit = 0.8;
        DrinkName userDrink = DrinkName.COFFEE;
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getCredit()).thenReturn(userCredit);
        when(mockedUserInputParser.getDrinkType()).thenReturn(userDrink);

        CreditChecker mockedCreditChecker = mock(CreditChecker.class);
        when(mockedCreditChecker.isEnoughMoneyForDrink(userCredit, userDrink)).thenReturn(true);

        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedCreditChecker, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getCredit();
        verify(mockedUserInputParser).getDrinkType();
        verify(mockedCreditChecker).isEnoughMoneyForDrink(userCredit, userDrink);
        verify(mockedDrinkMaker).make("C::");
    }

}