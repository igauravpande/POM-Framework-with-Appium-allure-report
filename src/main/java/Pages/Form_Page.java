package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Form_Page {
    private AppiumDriver driver;
    private AndroidDriver Driver;

    public Form_Page(AppiumDriver driver)
    {
       this.driver = driver;

    }

private By userName = By.id("io.selendroid.testapp:id/inputUsername");
private By email = By.id("io.selendroid.testapp:id/inputEmail");
private By pwd = By.id("io.selendroid.testapp:id/inputPassword");
private By name = By.id("io.selendroid.testapp:id/inputName");
private final By progLang = By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
private By accAdds = By.id("io.selendroid.testapp:id/input_adds");
private By regUserBtn = By.id("io.selendroid.testapp:id/btnRegisterUser");
private By form_pg = By.xpath("//*[text(),'Welcome to register a new User']");

public WebElement pageDisplay()
{

    WebElement element = driver.findElement(form_pg);
    return element;
}

public void setUserName(String username)
{
driver.findElement(userName).sendKeys(username);
}
public void setEmail(String e_mail)
{
    driver.findElement(email).sendKeys(e_mail);
}

public void setPassword(String password)
{
    driver.findElement(pwd).sendKeys(password);
}

public void setName(String name1)
{
    WebElement element = driver.findElement(name);
    element.clear();
    element.sendKeys(name1);

}

public void selectproglang()
{
    driver.findElement(progLang).click();
    driver.switchTo().alert();
    driver.findElement(By.xpath("//*[@index='5']")).click();
}


public void checkAcceptAdds()

{
    driver.findElement(accAdds).click();
}

public User_Page RegisterUser() throws InterruptedException {


    WebElement elem = driver.findElement(regUserBtn);
    elem.click();
    return new User_Page(driver);

}


}
