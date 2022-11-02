package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class BurgerTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    List<Ingredient> ingredients;

    Burger burger;

    @Before
    public void setUp() throws Exception {
        burger = new Burger();
    }

    @Test
    public void setBunsBunHadSet(){
        burger.setBuns(bun);
        assertEquals("Булочка должна быть поставлена", bun, burger.bun);
    }

    @Test
    public void addIngredientSetIngredientIngredientadded(){
        burger.addIngredient(ingredient);
        assertTrue("Список ингридиентов содержит ингридиент", burger.ingredients.contains(ingredient));
    }

    @Test
    public void removeIngredient(){

    }

    @Test
    public void moveIngredient(){

    }

    @Test
    public void getPriceCallMethodReturnPrice(){

        Mockito.when(ingredient.getPrice()).thenReturn(5F);
        Mockito.when(bun.getPrice()).thenReturn(10F);
        ingredients.add(ingredient);

        burger.bun = bun;
        burger.ingredients = ingredients;
        assertEquals("comment", 25F, burger.getPrice());
    }

    @Test
    public void getReceiptCallMethodReturnReceiptAsString(){

    }

}