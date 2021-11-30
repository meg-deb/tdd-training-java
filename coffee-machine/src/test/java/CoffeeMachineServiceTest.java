import models.DrinkName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CoffeeMachineServiceTest {

    @Test
    public void shouldRunAndMakeTea(){
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getDrinkType()).thenReturn(DrinkName.TEA);
        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getDrinkType();
        verify(mockedDrinkMaker).make("T::");
    }

    @Test
    public void shouldRunAndMakeChocolate(){
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getDrinkType()).thenReturn(DrinkName.HOT_CHOCOLATE);
        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getDrinkType();
        verify(mockedDrinkMaker).make("H::");
    }

    @Test
    public void shouldRunAndMakeCoffee(){
        UserInputParser mockedUserInputParser = mock(UserInputParser.class);
        when(mockedUserInputParser.getDrinkType()).thenReturn(DrinkName.COFFEE);
        DrinkMaker mockedDrinkMaker = mock(DrinkMaker.class);
        CoffeeMachineService testee = new CoffeeMachineService(mockedUserInputParser, mockedDrinkMaker);

        testee.run();

        verify(mockedUserInputParser).getDrinkType();
        verify(mockedDrinkMaker).make("C::");
    }

}