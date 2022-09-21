package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class User_Page {

    private AppiumDriver driver;
    public User_Page(AppiumDriver driver)
    {
        this.driver = driver;
    }
    private By regUser = By.id("io.selendroid.testapp:id/buttonRegisterUser");
    private By labelname = By.id("io.selendroid.testapp:id/label_name_data");
    private By labelusername = By.id("io.selendroid.testapp:id/label_username_data");
    private By labelpassword = By.id("io.selendroid.testapp:id/label_password_data");
    private By labelemail = By.id("io.selendroid.testapp:id/label_email_data");
    private By programmingLang = By.id("io.selendroid.testapp:id/label_preferedProgrammingLanguage_data");
    private By acceptads = By.id ("io.selendroid.testapp:id/label_acceptAdds_data");


    public String getlabelname()
    {
        String name = driver.findElement(labelname).getText();
        return name;
    }

    public String getregUser()
    {
        String user = driver.findElement(labelusername).getText();
        return user;
    }

    public String getpassword()
    {
        String pass = driver.findElement(labelpassword).getText();
        return pass;
    }

    public String getemail()
    {
        String mail = driver.findElement(labelemail).getText();
        return mail;
    }

    public String getprogramlang()
    {
        String language = driver.findElement(programmingLang).getText();
        return language;
    }

    public String getCheckads()
    {
        String b = driver.findElement(acceptads).getText();
        return b;
    }

    public Home_Page Click_RegisterUserBtn()
    {
        driver.findElement(regUser).click();
        return new Home_Page(driver);

    }
}
