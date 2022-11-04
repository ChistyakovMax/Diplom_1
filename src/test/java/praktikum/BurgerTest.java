package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Mock
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
        //ingredients.add(ingredient);
        Mockito.when(ingredients.remove(1)).thenReturn(ingredient);
        burger.ingredients = ingredients;
        burger.removeIngredient(1);
        Mockito.verify(burger.ingredients).remove(1);

    }

    @Test
    public void moveIngredientCallMethodIngridientsMoved(){

        int index = 1;
        int newIndex = 2;

        burger.ingredients = ingredients;
        burger.moveIngredient(index,newIndex);
        Mockito.verify(burger.ingredients).add(newIndex, ingredients.remove(index));
        Mockito.verify(burger.ingredients).remove(index);
    }

    @Test
    public void moveIngredient(){

    }

    @Test
    public void getReceiptCallMethodReturnReceiptAsString(){

    }

}