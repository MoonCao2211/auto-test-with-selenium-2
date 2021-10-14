import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestNG {
    public static ChromeDriver driver = null;

    @BeforeClass
    public void setUp() {
        try {
            driver = new ChromeDriver();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testSimple() {
        try {
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            driver.findElement(By.id("login-button")).click();

            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("inventory"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }
}
