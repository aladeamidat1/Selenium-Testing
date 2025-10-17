package part2.com.saucedemo.tests.Product;

import com.suacedemo.pages.ProductPage;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

import static org.testng.Assert.assertTrue;


public class ProductTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
    ProductPage productPage= loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productPage.isProductsHeaderDisplayed()," products Header Is Not Displayed");

    }
}
