package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BurgerGetPriceParameterizedTest {
    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    Burger burger;
    private final int numOfIngridients; //кол-во ингридиентов в бургере
    private final float expected;

    public BurgerGetPriceParameterizedTest(int numOfIngridients, float expected) {
        this.numOfIngridients = numOfIngridients;
        this.expected = expected;
    }

    @Before
    public void init() {

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
        burger = new Burger();
        MockitoAnnotations.initMocks(this);
        Mockito.when(bun.getPrice()).thenReturn(5F);
        Mockito.when(ingredient.getPrice()).thenReturn(10F);

        burger.bun = bun;
        for (int i = 0; i < numOfIngridients; i++){
            burger.ingredients.add(ingredient);
        }

        assertEquals("comment", expected, burger.getPrice(), 0);
    }
}
