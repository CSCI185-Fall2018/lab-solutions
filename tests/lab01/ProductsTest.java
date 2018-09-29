package lab01;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class ProductsTest
{

    @Test
    public void test_overall()
    {
        Products products = new Products();
        Product test_product, actual;

        test_product = new Product("milk", 1.00f);

        products.add(test_product);
        assertEquals(1, products.size());

        actual = products.get(0);
        assertEquals(test_product, actual);

        actual = products.query(test_product.getName());
        assertEquals(test_product, actual);

        actual = products.query("eggs");
        assertNull(actual);

    }
}
