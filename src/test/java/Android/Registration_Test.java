package Android;

import Android.Base_Test;
import Pages.Form_Page;
import Pages.User_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Registration_Test extends Base_Test {

@Test
    public void TestProgressBar() throws InterruptedException {
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         Form_Page formPage = homePage.Tap_ShowBarBtn();
         Assert.assertTrue(formPage.pageDisplay().isDisplayed(), "Registration form is not Displayed");
         formPage.setUserName("maima1");
         formPage.setEmail("abc@gmail.com");
         formPage.setPassword("ab34");
         formPage.setName("Omaima Asim");
         formPage.selectproglang();
         formPage.checkAcceptAdds();
         User_Page userPage = formPage.RegisterUser();
         Assert.assertEquals(userPage.getlabelname(),"Omaima Asim","Incorrect!");
         Assert.assertEquals(userPage.getregUser(),"maima1","Incorrect!");
         Assert.assertEquals(userPage.getpassword(),"ab34","Incorrect!");
         Assert.assertEquals(userPage.getemail(),"abc@gmail.com","Incorrect!");
         Assert.assertEquals(userPage.getprogramlang(),"Java","Incorrect!");
         Assert.assertEquals(userPage.getCheckads(),"true","Incorrect!");
         System.out.println("User is Verified");
         userPage.Click_RegisterUserBtn();

}
}
