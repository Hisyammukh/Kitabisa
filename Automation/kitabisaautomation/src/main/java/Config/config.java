package Config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IT040817 on 8/23/2019.
 */
public class config {
    public static WebDriver driver;

    public static void initialize(){
        System.setProperty("webdriver.chrome.driver", "../kitabisaautomation/Driver/chromedriver.exe");

        Map<String, String> mobileEmulation = new HashMap<String, String>();

        mobileEmulation.put("deviceName", "Nexus 5");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        driver = new ChromeDriver(chromeOptions);

        Dimension d = new Dimension(300,840);
        driver.manage().window().setSize(d);
        driver.get("https://m.kitabisa.com");
    }

    public static void DriverQuit() {
        driver.quit();
    }
}
