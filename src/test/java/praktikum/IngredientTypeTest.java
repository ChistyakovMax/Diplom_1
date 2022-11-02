package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void ingredientTypeReturnSAUCE(){
        assertEquals("должен вернуться SAUCE", "SAUCE", IngredientType.SAUCE.name());
    }

    @Test
    public void ingredientTypeReturnFILLING(){
        assertEquals("должен вернуться FILLING", "FILLING", IngredientType.FILLING.name());
    }


}