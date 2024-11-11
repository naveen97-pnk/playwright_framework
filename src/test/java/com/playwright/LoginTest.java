package com.playwright;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LoginTest extends LaunchBrowser {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LoginTest loginTest = new LoginTest();
        loginTest.page.navigate("https://google.co.in");
        loginTest.page.close();
        loginTest.playwright.close();
    }
}
