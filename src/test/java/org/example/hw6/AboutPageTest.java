package org.example.hw6;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import java.time.Duration;
@TestMethodOrder(OrderAnnotation.class)
public class AboutPageTest extends AbstractTest {

    @Order(1)
    @Test
    void loginIn(){
        new AboutPage(getWebDriver())
                //  .setLogin("standard_user")
                //  .setPassword("secret_sauce")
                .loginIn("standard_user","secret_sauce");
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html",getWebDriver().getCurrentUrl());

    }

    @Order(2)
    @Test
    void clickToMenu(){
        new AboutPage(getWebDriver()).navigateToMenu();
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html",getWebDriver().getCurrentUrl());

    }
    @Order(3)
    @Test
    void clickToAbout(){
        new AboutPage(getWebDriver()).navigateToAbout();
        Assertions.assertEquals("https://saucelabs.com/",getWebDriver().getCurrentUrl());
    }


}
