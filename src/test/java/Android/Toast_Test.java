package Android;

import Android.Base_Test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Toast_Test extends Base_Test {

@Test
public void TestToastSuccessfully() throws InterruptedException {


            Assert.assertTrue(homePage.Display_ToastBtn().isDisplayed(),"Display a Toast button is invisible");
            Assert.assertTrue(homePage.getToastVisibility().isDisplayed(),"Toast message is invisible");
            System.out.println("Toast Message: "+homePage.getToastmessage());

    }
}



