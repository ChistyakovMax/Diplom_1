package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class BurgerGetReceiptParameterizedTest extends BurgerCommonParameterizedTest {

    private String mockName;

    private String expected;

    IngredientType type = IngredientType.FILLING;

    public BurgerGetReceiptParameterizedTest(int numOfIngredients, String mockName, String expected) {
        super(numOfIngredients);
        this.expected = expected;
        this.mockName = mockName;
    }

    //тут не стал использовать name, тестовые данные слишком длинные
    @Parameterized.Parameters(name = "burger has {0} ingredients, name of ingredients is {1}, the receipt {2}")
    public static Object[][] testData() {
        return new Object[][]{
                {0, "", "(====  ====)" + System.lineSeparator() +
                        "(====  ====)" + System.lineSeparator() +
                        System.lineSeparator() +
                        "Price: 10,000000" + System.lineSeparator()},


                {1, "n", "(==== n ====)" + System.lineSeparator() +
                        "= filling n =" + System.lineSeparator() +
                        "(==== n ====)" + System.lineSeparator() +
                        System.lineSeparator() +
                        "Price: 20,000000" + System.lineSeparator()},


                {5, "name", "(==== name ====)" + System.lineSeparator() +
                        "= filling name =" + System.lineSeparator() +
                        "= filling name =" + System.lineSeparator() +
                        "= filling name =" + System.lineSeparator() +
                        "= filling name =" + System.lineSeparator() +
                        "= filling name =" + System.lineSeparator() +
                        "(==== name ====)" + System.lineSeparator() +
                        System.lineSeparator() +
                        "Price: 60,000000" + System.lineSeparator()},


                {20, "NaMe01!)", "(==== NaMe01!) ====)" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "= filling NaMe01!) =" + System.lineSeparator() +
                        "(==== NaMe01!) ====)" + System.lineSeparator() +
                        System.lineSeparator() +
                        "Price: 210,000000" + System.lineSeparator()}
        };
    }

    @Test
    public void getReceiptCallMethodReturnReceiptAsString() {
        super.getBurger(numOfIngredients);

        Mockito.when(bun.getName()).thenReturn(mockName);
        Mockito.when(ingredient.getName()).thenReturn(mockName);
        Mockito.when(ingredient.getType()).thenReturn(type);

        Assert.assertEquals("должен возвращаться рецепт бургера", expected, burger.getReceipt());
    }

}
