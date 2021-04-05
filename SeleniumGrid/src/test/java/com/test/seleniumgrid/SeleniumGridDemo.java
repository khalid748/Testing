package com.test.seleniumgrid;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import java.net.URL;

public class SeleniumGridDemo {

    @Test
    public void test1()  {

        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setPlatform(Platform.WIN10);

            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.112.241:5555/wd/hub"), desiredCapabilities);
            driver.manage().window().maximize();
            driver.get("https://bikroy.com/en/shops/careers");
           // System.out.println("Title of the page is " + driver.getTitle());
            Thread.sleep(5000);
            driver.quit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
