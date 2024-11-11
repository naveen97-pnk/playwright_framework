/**
 * Project Name: Playwright Learning by navepilla@deloitte.com
 * Author: Naveen Kumar Pilla
 * Date: 05 Nov, 2024
 * Description: This class is used to launch browser
 * This is common accross all java files in this project.
 */

package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Class Name: LaunchBrowser
 * Description: This test class encapsulates the launch browser mechanism.
 */
public class LaunchBrowser {

    protected Page page; // Page instance
    protected Playwright playwright; // Playwright instance

    /**
     * Constructor to initialize the WebDriver.
     */
    public LaunchBrowser() {
        this.playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1512, 823));
        this.page = browserContext.newPage();
    }

}
