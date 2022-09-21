package Android;

import Pages.Home_Page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base_Test {

   public AppiumDriver driver;
   protected Home_Page homePage;


    @BeforeTest
    public void setup() throws MalformedURLException {

        AndroidDriver androidDriver;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"SMG935F");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID,"ce11160be8d3430705");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        caps.setCapability("unicodeKeyboard", true);
        caps.setCapability("resetKeyboard", true);
        caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/apps/selendroid-test-app.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
        homePage = new Home_Page(driver);

    }

    public void getScreenshot(AppiumDriver driver) throws IOException {

        SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        Date date = new Date();
        String fileName = sdf.format(date);
        File ss = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File(System.getProperty("user.dir")+"/screenshot/"+fileName+".png"));
        System.out.println("Screenshot is captured");

    }

    @AfterTest
    public void tearDown()
    {


    }
}
