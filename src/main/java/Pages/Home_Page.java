package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home_Page {

    private AppiumDriver driver;
    public Home_Page(AppiumDriver driver)
    {
        this.driver = driver;
    }

    private By barBtn = By.id("io.selendroid.testapp:id/waitingButtonTest");
    private By progressBar = By.id("android:id/progress_number");

    private By toast_btn = By.id("io.selendroid.testapp:id/showToastButton");
    private By toast = By.xpath("//*[@text(),'Hello selendroid toast!']");
    private By toast_message = By.xpath("/hierarchy/android.widget.Toast");

    private By checkAds = By.id("io.selendroid.testapp:id/input_adds_check_box");
    public WebElement Display_ToastBtn()
    {
        WebElement displayBtn = driver.findElement(toast_btn);
        return displayBtn;
    }

    public  void click_ToastBtn()
    {
        driver.findElement(toast_btn).click();
    }

    public WebElement getToastVisibility()
    {
        WebElement toast_visible = driver.findElement(toast);
        return toast_visible;
    }

    public String getToastmessage()
    {
        click_ToastBtn();
        WebElement tst_message = driver.findElement(toast_message);
        String message = tst_message.getText();
        return message;
    }

    public boolean unCheckBox()
    {
        WebElement checkBox = driver.findElement(checkAds);
        checkBox.click();
        return checkBox.getAttribute("checked").equalsIgnoreCase("true");
    }
    public Form_Page Tap_ShowBarBtn()
    {
        driver.findElement(barBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        boolean progressStatus = wait.until(ExpectedConditions.attributeToBe(progressBar,"text","75/100"));
        if(progressStatus == true)
        {
            return new Form_Page(driver);
        }

        return null;
    }
}
