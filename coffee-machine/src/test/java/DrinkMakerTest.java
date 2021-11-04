import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    @Test
    public void shouldMakeHotChocolate() {
        DrinkMaker testDrinkMaker = new DrinkMaker();
        String order = "H::";
        HotChocolate hotChocolate = new HotChocolate(0, false);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(hotChocolate);
        System.out.println(hotChocolate);
    }

    @Test
    public void shouldMakeHotChocolateWithSugarAndStick() {
        DrinkMaker testDrinkMaker = new DrinkMaker();
        String order = "H:1:0";
        HotChocolate hotChocolate = new HotChocolate(1, true);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(hotChocolate);
        System.out.println(hotChocolate);
    }

    @Test
    public void shouldMakeCoffee() {
        DrinkMaker testDrinkMaker = new DrinkMaker();
        String order = "C::";
        Coffee coffee = new Coffee(0, false);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(coffee);
        System.out.println(coffee);
    }

    @Test
    public void shouldMakeCoffeeWith2SugarAndStick() {
        DrinkMaker testDrinkMaker = new DrinkMaker();
        String order = "C:2:0";
        Coffee coffee = new Coffee(2, true);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(coffee);
    }

    @Test
    public void shouldMakeTea() {
        DrinkMaker testDrinkMaker = new DrinkMaker();
        String order = "T::";
        Tea tea = new Tea(0, false);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(tea);
        System.out.println(tea);
    }

    @Test
    public void shouldMakeTeaWith3SugarAndStick() {
        DrinkMaker testDrinkMaker = new DrinkMaker();
        String order = "T:3:0";
        Tea tea = new Tea(3, true);

        Drink result = testDrinkMaker.make(order);

        assertThat(result).isEqualTo(tea);
        System.out.println(tea);
    }
}