/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mobile.tests.gradle;

import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppTest {
    @Test
    public void installApp() throws MalformedURLException {
        String seleniumGridURL = System.getenv("SELENIUM_GRID_URL");
        String androidAppPath = System.getenv("ANDROID_APP_PATH");
        WebDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", androidAppPath + "/android/Android-NativeDemoApp-0.2.1.apk");
        capabilities.setCapability("uiautomator2ServerInstallTimeout",90000);
        capabilities.setCapability("uiautomator2ServerLaunchTimeout",90000);
        capabilities.setCapability("adbExecTimeout",90000);
        capabilities.setCapability("automationName", "UiAutomator2");
        driver = new RemoteWebDriver(new URL(seleniumGridURL), capabilities);
    }
}
