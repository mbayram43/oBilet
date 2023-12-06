package pages;

import constant.Constants;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constant.Constants.*;

public class SignUpPage extends  BasePage {

    AppiumDriver appiumDriver;


    public SignUpPage(AppiumDriver appiumDriver) {

        this.appiumDriver=appiumDriver;

    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }


    public SignUpPage splashClick() throws InterruptedException{

        Thread.sleep(1000);
        click(Splash_button);
        Thread.sleep(1000);
        return this;

    }

    public SignUpPage accountClick() throws InterruptedException{

        Thread.sleep(1000);
        click(hesabim);
        Thread.sleep(1000);
        return this;

    }

    public SignUpPage memberLogin() throws InterruptedException{

        Thread.sleep(1000);
        click(uye_girisi_butonu);
        Thread.sleep(1000);
        return this;

    }


    public SignUpPage beMemberNow() throws InterruptedException{

        Thread.sleep(1000);
        click(be_member_now);
        Thread.sleep(1000);
        return this;

    }
    public SignUpPage enterMail() throws InterruptedException{
        Thread.sleep(1000);
        sendKeys(mail_textbox, EMAIL);

        return this;

    }
    public SignUpPage enterPassword() throws InterruptedException{
        Thread.sleep(1000);
        sendKeys(password_textbox, PASSWORD);

        return this;

    }
    public SignUpPage beMember() throws InterruptedException{

        Thread.sleep(1000);
        click(uye_ol_butonu);
        Thread.sleep(1000);
        return this;

    }


    public void isUserLogin() {
        waitSeconds(5);
        WebElement is_login = driver.findElement(Constants.is_it_login);
        Assert.assertEquals(is_login,is_login);
        System.out.println("Üyelik Oluşturuldu");
    }







    }
