import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase1 {

    public static AndroidDriver driver;

    @Before
    public void setUp() throws Exception{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "TestPhone1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("autoLaunch", true);
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("appPackage", "com.example.practiceautomationappiumwithandroid");
        capabilities.setCapability("app", System.getProperty("user.dir")+"/apk/app-debug.apk");
        capabilities.setCapability("appActivity", ".MainActivity");
        capabilities.setCapability("newCommandTimeout", 40);
        capabilities.setCapability("platformVersion", "8.0.0");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void TestCse1() {
        WebElement textView = driver.findElementById("com.example.practiceautomationappiumwithandroid:id/textView1");
        WebElement button1 = driver.findElementById("com.example.practiceautomationappiumwithandroid:id/button1");
        WebElement button2 = driver.findElementById("com.example.practiceautomationappiumwithandroid:id/button2");

        Assert.assertEquals("초기 화면이다.", "Hello world!", textView.getText());
        button1.click();
        button2.click();
    }
}
