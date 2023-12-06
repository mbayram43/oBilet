import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignUpPage;

import static utils.AppiumDriver_ex.getAppiumDriver;

public class Signup_Test extends BasePage {
    SignUpPage signUpPage;

    @BeforeClass
    public void before(){

        signUpPage=new SignUpPage(getAppiumDriver());


    }
    @Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);
        signUpPage
                .splashClick()
                .accountClick()
                .memberLogin()
                .beMemberNow()
                .enterMail()
                .enterPassword()
                .beMember()
                .isUserLogin();


    }

}