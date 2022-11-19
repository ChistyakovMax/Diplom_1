package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    Bun bun;
    String name = "name";
    float price = 10;

    @Before
    public void setUp() {
        bun = new Bun(name, price);
    }

    @Test
    public void getNameCallMethodReturnName() {
        assertEquals("должно возвращаться наименование булочки", name, bun.getName());
    }

    @Test
    public void getPriceCallMetodReturnPrice() {
        assertEquals("должна возвращаться цена булочки", price, bun.getPrice(), 0);
    }
    
}
