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
        WebDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "/apps/android/Android-NativeDemoApp-0.2.1.apk");

        driver = new RemoteWebDriver(new URL("http://192.168.97.137:4723/wd/hub"), capabilities);
    }
}
