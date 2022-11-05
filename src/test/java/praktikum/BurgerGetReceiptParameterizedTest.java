package praktikum;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BurgerGetReceiptParameterizedTest extends BurgerCommonParameterizedTest{

    public BurgerGetReceiptParameterizedTest(int numOfIngridients, float expected) {
        super(numOfIngridients, expected);
    }
}
