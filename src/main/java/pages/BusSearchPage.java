package pages;

import io.appium.java_client.AppiumDriver;

import static constant.Constants.*;

public class BusSearchPage extends  BasePage {
    AppiumDriver appiumDriver;


    public BusSearchPage(AppiumDriver appiumDriver) {

        this.appiumDriver=appiumDriver;

    }
    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }
    public BusSearchPage bus_Search() throws InterruptedException{

        Thread.sleep(1000);
        click(bus_search);
        Thread.sleep(1000);
        return this;

    }

    /*public void selectDeparture(){
        click(nereden_textbox);
        sendKeys(nereden_textbox, "Prag");
        waitSeconds(3);
        click(selectedDepartureText);
    }*/


}
