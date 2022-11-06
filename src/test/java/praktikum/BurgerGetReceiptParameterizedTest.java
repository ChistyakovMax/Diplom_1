package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class BurgerGetReceiptParameterizedTest extends BurgerCommonParameterizedTest{

    private String mockName;

    private String expected;

    IngredientType type = IngredientType.FILLING;

    public BurgerGetReceiptParameterizedTest(int numOfIngredients, String mockName, String expected) {
        super(numOfIngredients);
        this.expected = expected;
        this.mockName = mockName;
    }

    @Parameterized.Parameters
    public static Object[][] testData(){
        return new Object[][]{
                {0, "", "(====  ====)\r\n" +
                        "(====  ====)\r\n" +
                        "\r\n" +
                        "Price: 10,000000\r\n"},



                {1, "n", "(==== n ====)\r\n" +
                        "= filling n =\r\n" +
                        "(==== n ====)\r\n" +
                        "\r\n" +
                        "Price: 20,000000\r\n"},



                {5, "name", "(==== name ====)\r\n" +
                        "= filling name =\r\n" +
                        "= filling name =\r\n" +
                        "= filling name =\r\n" +
                        "= filling name =\r\n" +
                        "= filling name =\r\n" +
                        "(==== name ====)\r\n" +
                        "\r\n" +
                        "Price: 60,000000\r\n"},



                {20, "NaMe01!)", "(==== NaMe01!) ====)\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "= filling NaMe01!) =\r\n" +
                        "(==== NaMe01!) ====)\r\n" +
                        "\r\n" +
                        "Price: 210,000000\r\n"}
        };
    }

    @Test
    public void getReceiptCallMethodReturnReceiptAsString(){
        super.getBurger(numOfIngridients);

        Mockito.when(bun.getName()).thenReturn(mockName);
        Mockito.when(ingredient.getName()).thenReturn(mockName);
        Mockito.when(ingredient.getType()).thenReturn(type);
        //Mockito.when(burger.getPrice()).thenReturn(10F);

        Assert.assertEquals("должен возвращаться рецепт бургера", expected, burger.getReceipt());
    }

}
