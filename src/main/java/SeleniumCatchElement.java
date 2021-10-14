import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCatchElement {
    public static ChromeDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.navigate().to("https://www.saucedemo.com/"); // = get("")
        driver.navigate().refresh(); // = reload in browser
        driver.navigate().back(); // go back to previous page
        driver.navigate().forward(); // go to next page

        WebElement inputUserNameById = driver.findElement(By.id("user-name"));
//        WebElement inputUserNameByClass = driver.findElement(By.className("input_error form_input"));
        WebElement inputUserNameByClass = driver.findElement(By.className("form_input"));
        WebElement inputUserNameByName = driver.findElement(By.name("user-name"));
        WebElement inputUserNameByXPat = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement inputUserNameByCSSSelector = driver.findElement(By.cssSelector("#user-name"));
        WebElement inputUserNameByTagName = driver.findElement(By.tagName("input"));

        // => Có nhiều cách bắt element.

        //close browser:
        driver.quit();
        driver.close();
        /*
            => Nếu chỉ mở browser, không mở thêm tab mới thì .close() và .quit() thì đèu là action tắt browser.
            => Nếu có từ 2 tab trở lên thì close chỉ đóng tab, không đóng trình duyệt, còn quit thì đóng cả browser
         */
    }
}
