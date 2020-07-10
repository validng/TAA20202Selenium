import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    public void simpleTest() {
        System.out.println("this is the first test");


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("at-cv-lightbox-close")).click();



        System.out.println(driver.getTitle());

        if(driver.findElement(By.id("user-message")).isDisplayed()){
            driver.findElement(By.id("user-message")).sendKeys("Hello World!");
        }

        // System.out.println(driver.switchTo().alert().getText());

        // driver.close();

    }

}
