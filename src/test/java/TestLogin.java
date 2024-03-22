import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
    @Test
    public void logInTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("lakshyakumarsirohi@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("zfmUj2c@U@8p2r");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

        String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/account";
        Assert.assertEquals(expectedURL,driver.getCurrentUrl());

        driver.quit();
    }
}
