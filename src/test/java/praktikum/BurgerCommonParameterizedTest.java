package praktikum;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class BurgerCommonParameterizedTest {
    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    Burger burger;
    protected  int numOfIngridients; //кол-во ингридиентов в бургере

    public BurgerCommonParameterizedTest(int numOfIngridients) {
        this.numOfIngridients = numOfIngridients;

    }

    //общий метод для создания бургера и наполнения его ингридиентами
    public void getBurger(int numOfIngridients){
        MockitoAnnotations.initMocks(this);
        Mockito.when(bun.getPrice()).thenReturn(5F);
        Mockito.when(ingredient.getPrice()).thenReturn(10F);

        burger = new Burger();
        burger.bun = bun;

        for (int i = 0; i < numOfIngridients; i++){
            burger.ingredients.add(ingredient);
        }
    }
}
