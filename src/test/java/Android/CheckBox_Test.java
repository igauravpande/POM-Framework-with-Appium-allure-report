package Android;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class CheckBox_Test extends Base_Test {

    @Test
    public void TestCheckBoxSuccessfully() throws IOException {

        SoftAssert softAssert = new SoftAssert();
        boolean Actual = homePage.unCheckBox();
        softAssert.assertFalse(Actual,"CheckBox assertion failed!");
        if(Actual)
        {
            System.out.println("CheckBox is checked");
            getScreenshot(driver);
        }
        else
        {
            System.out.println("CheckBox is unchecked");
            getScreenshot(driver);

        }
    }
}
