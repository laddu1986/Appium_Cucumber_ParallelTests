package Steps;

import Setups.Capabilities;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.List;

public class MyStepdefs extends Capabilities {

    @BeforeTest(alwaysRun = true)
    @Parameters({"platformName", "platformVersion", "udid", "systemPort"})
    public void setup(String platformName, String platformVersion, String udid, Integer systemPort) throws Exception {
        preparation(platformName,platformVersion,udid,systemPort);
    }

    public void cekPopUp(){
        List<MobileElement> cekGeoPop = driver.findElements(By.id("com.android.packageinstaller:id/" +
                "permission_allow_button"));
        Integer sizeCekGeoPop = cekGeoPop.size();

        if(sizeCekGeoPop != 0)
        {
            driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click(); //popup
        }
    }

    public void cekLocDevice(){
        List<MobileElement> cekLoc = driver.findElements(By.id("android:id/button2"));
        Integer sizeCekLoc = cekLoc.size();

        if(sizeCekLoc != 0)
        {
            driver.findElement(By.id("android:id/button2")).click(); //popup
        }
    }

    @Test
    public void userLaunchGojek() throws Throwable {
        //cek popup geo muncul kagak
        cekPopUp();

        //cek pop loc muncul kagak
        cekLocDevice();

        driver.findElement(By.id("com.gojek.app:id/button_login")).click();

        //cek pop loc muncul kagak
        cekLocDevice();

        driver.findElement(By.id("com.gojek.app:id/btn_login")).click();

        //cek popup sms muncul kagak
        cekPopUp();

        driver.findElement(By.id("com.gojek.app:id/input_field")).click();
        driver.findElement(By.id("com.gojek.app:id/input_field")).sendKeys("1234567890");
        driver.navigate().back();
        driver.findElement(By.id("com.gojek.app:id/button_continue")).click();
    }

//    @AfterTest(alwaysRun = true)
//    public void stopServer() {
//        super.stopServer();
//    }
}