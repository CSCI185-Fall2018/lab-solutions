package lab01;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest
{
    @Test
    public void test_not_equals()
    {
        Product p1 = new Product("milk", 2.10f);
        Product p2 = new Product("eggs", 1.20f);
        assertNotEquals(p1, p2);
    }

    @Test
    public void test_equals()
    {
        Product p1 = new Product("milk", 1.00f);
        Product p2 = new Product("milk", 1.00f);
        assertNotEquals(p1, p2);
    }

    @Test
    public void test_to_string()
    {
        Product product = new Product("apple", 1.00f);
        String actual = product.toString();
        String expected = "Product {name: apple, unit_price: 1.00}";
        assertEquals(expected, actual);
    }
}
