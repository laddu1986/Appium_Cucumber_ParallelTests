package Setups;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities extends DesiredCapabilities {
    protected AndroidDriver driver;
    private AppiumDriverLocalService service;

    protected void preparation(String platformName, String platformVersion, String udid, Integer systemPort)
            throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("deviceName", udid);
        capabilities.setCapability("systemPort", systemPort);
        capabilities.setCapability("appPackage", "com.gojek.app");
        capabilities.setCapability("appActivity", "com.gojek.app.home.HomeActivity");
        //capabilities.setCapability("app", "https://github.com/saucelabs/sample-app-mobile/releases/download/2.2.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.1.1.zip);


        //Start the server
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);

        driver = new AndroidDriver(new URL(service_url), capabilities);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public void stopServer() {
        driver.quit();
        service.stop();
    }
}
