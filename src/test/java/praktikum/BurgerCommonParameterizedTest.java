package praktikum;

import org.mockito.Mock;

public class BurgerCommonParameterizedTest {
    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    Burger burger;
    protected  int numOfIngridients; //кол-во ингридиентов в бургере
    protected  float expected;

    public BurgerCommonParameterizedTest(int numOfIngridients, float expected) {
        this.numOfIngridients = numOfIngridients;
        this.expected = expected;
    }
}
