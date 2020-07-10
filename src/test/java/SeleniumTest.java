import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    @Test
    public void simpleTest(){
        System.out.println("simple test");
        //System.out.println(System.getProperty("user.dir")); putanja za drugi arg
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
        //3.arg copy from content root desni klik na chromedriver.exe
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

        driver.get(baseUrl);
        System.out.println(driver.getTitle());


        driver.manage().window().maximize();//maksimaze a window ili moze sa fullscreen

//        System.out.println(driver.findElement(By.id("user-message")).isDisplayed());
        if (driver.findElement(By.id("at-cv-lightbox-close")).isDisplayed()) {//drajver je spor pa moram ovu proveru

            driver.findElement(By.id("at-cv-lightbox-close")).click();
        }
        if (driver.findElement(By.id("user-message")).isDisplayed()){
            driver.findElement(By.id("user-message")).sendKeys("Hello world");
        }
        //driver.switchTo().alert().getText(); za popup

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.close();

        //domaci tabela 2 red ostampaj
    }
}
