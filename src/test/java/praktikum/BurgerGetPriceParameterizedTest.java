package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BurgerGetPriceParameterizedTest extends BurgerCommonParameterizedTest{

    private float expected;

    public BurgerGetPriceParameterizedTest(int numOfIngredients, float expected) {
        super(numOfIngredients);
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] testData(){
        return new Object[][]{
                {0, 10F},
                {1, 20F},
                {2, 30F},
                {7, 80F},
                {100, 1010F}
        };
    }

    @Test
    public void getPriceCallMethodReturnPrice(){
        super.getBurger(numOfIngridients);

        Mockito.when(bun.getPrice()).thenReturn(5F);
        Mockito.when(ingredient.getPrice()).thenReturn(10F);

        assertEquals("comment", expected, burger.getPrice(), 0);
    }
}
