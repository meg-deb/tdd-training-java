import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {
    CoffeeMachineUI mockedCoffeeMachineUI;
    DrinkMaker testDrinkMaker;

    @BeforeEach
    private void beforeEach() {
        mockedCoffeeMachineUI = Mockito.mock(CoffeeMachineUI.class);
        testDrinkMaker = new DrinkMaker(mockedCoffeeMachineUI);
    }

    @Test
    public void shouldMakeHotChocolate() {
        String order = "H::";
        HotChocolate hotChocolate = new HotChocolate(0, false);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(hotChocolate);
    }

    @Test
    public void shouldMakeHotChocolateWithSugarAndStick() {
        String order = "H:1:0";
        HotChocolate hotChocolate = new HotChocolate(1, true);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(hotChocolate);
    }

    @Test
    public void shouldMakeCoffee() {
        String order = "C::";
        Coffee coffee = new Coffee(0, false);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(coffee);
    }

    @Test
    public void shouldMakeCoffeeWith2SugarAndStick() {
        String order = "C:2:0";
        Coffee coffee = new Coffee(2, true);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(coffee);
    }

    @Test
    public void shouldMakeTea() {
        String order = "T::";
        Tea tea = new Tea(0, false);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(tea);
    }

    @Test
    public void shouldMakeTeaWith3SugarAndStick() {
        String order = "T:3:0";
        Tea tea = new Tea(3, true);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(tea);
    }

    @Test
    public void shouldCallCoffeeMachineUIToPrintMessage() {
        String order = "M:test";

        Drink result = testDrinkMaker.make(order);

        Mockito.verify(mockedCoffeeMachineUI).printMessage("test");

        assertThat(result).isEqualTo(null);
    }
}