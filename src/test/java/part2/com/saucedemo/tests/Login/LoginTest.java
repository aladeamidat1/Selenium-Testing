package part2.com.saucedemo.tests.Login;

import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("morenikeji");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        assertTrue(actualMessage.contains("Epic sadface"));
    }
}
