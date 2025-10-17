package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ayomide-trials718.orangehrmlive.com/securityAuthentication/retryLogin");


    }

    @AfterClass
    public void tearDown() {
        //driver.quit();

    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
    WebElement username =  driver.findElement(By.name("txtUsername"));
    username.sendKeys("admin");

    var password = driver.findElement(By.name("txtPassword"));
    password.sendKeys("f0YCj@B3Sg");

    driver.findElement(By.tagName("button")).click();
    Thread.sleep(2000);
    String actualResult = driver.findElement(By.linkText("Employee Management")).getText();
    String expectedResult = "Employee Management";
    assertEquals(actualResult , expectedResult);
    }
}
