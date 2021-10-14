import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFuncLogin {
    public static ChromeDriver driver = null;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String userName = "standard_user";
        String passWord = "secret_sauce";
        login(userName, passWord);
        driver.quit();
    }
    public static void login(String usernameStr, String passwordStr){
        WebElement inputUserName = driver.findElement(By.id("user-name"));
        inputUserName.sendKeys(usernameStr);
        WebElement inputPassWord = driver.findElement(By.id("password"));
        inputPassWord.sendKeys(passwordStr);
        WebElement clickButtonLogin = driver.findElement(By.id("login-button"));
        clickButtonLogin.click();

    }
}
