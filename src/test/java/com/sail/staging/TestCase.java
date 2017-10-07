package com.sail.staging;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestCase {


    @BeforeClass(alwaysRun=true)
    public static void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/joninow/Documents/SeleniumDrivers/chromedriver");

        ChromeDriverManager.getInstance().setup();
        Configuration.browser="chrome";
        Configuration.baseUrl = "http://staging.sail.com.au/admin/login";
    }

    @Test
    public void Login() throws Exception {

        Selenide.open(Configuration.baseUrl);

    }


}
