package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriver_ex;

import java.time.Duration;

public class BasePage {
    AppiumDriver driver = AppiumDriver_ex.getAppiumDriver();
    Wait wait = new WebDriverWait(driver, Duration.ofSeconds(20));



    public WebElement findElement(By by){

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);

    }

    public void sendKeys(By by,String txt){

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        findElement(by).sendKeys(txt);
    }

    public void click(By by){
        findElement(by).click();

    }
    public void waitSeconds(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
