package constant;

import org.openqa.selenium.By;

public class Constants {
    public static final By is_it_login=By.xpath("//*[@resource-id='com.obilet.androidside:id/item_title_textView']");
    public static final String EMAIL = "maykoopasamm@gmail.com";
    public static final String PASSWORD = "Ankara12*";
    public static final By Splash_button=By.className("android.widget.ImageView");
    public static final By hesabim=By.id("com.obilet.androidside:id/bottom_nav_account");
    public static final By uye_girisi_butonu=By.id("com.obilet.androidside:id/login_button_main_account");
    public static final By mail_textbox=By.xpath("(//*[@resource-id='com.obilet.androidside:id/input_editText'])[1]");
    public static final By password_textbox=By.xpath( "(//*[@resource-id='com.obilet.androidside:id/input_editText'])[2]");
    public static final By be_member_now=By.id( "com.obilet.androidside:id/sign_up_now_layout");
    public static final By  uye_ol_butonu=By.id("com.obilet.androidside:id/sign_up_button");
    public static final By ara_butonu=By.id("com.obilet.androidside:id/bottom_nav_find_journey");
    public static final By bus_search=By.xpath("//android.widget.FrameLayout[@resource-id=\"com.obilet.androidside:id/journey_type_tabLayout\"]/android.view.View");
    public static final By nereden_textbox=By.id("com.obilet.androidside:id/find_bus_journey_from_where_textView");
    public static final By nereye_textbox=By.id(" com.obilet.androidside:id/find_bus_journey_to_where_textView");
}
