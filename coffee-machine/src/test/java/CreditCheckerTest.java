import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CreditCheckerTest {

    CreditChecker testCreditChecker = new CreditChecker();

    @Test
    public void shouldReturnTrueIfEnoughMoneyForTea(){
        double money = 0.4;
        Drink drinkToMake = new Tea(0, false);

        boolean result = testCreditChecker.isExactMoneyForDrink(money, drinkToMake);

        assertThat(result).isTrue();
    }
}
