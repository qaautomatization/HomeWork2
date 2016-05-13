package com.gl.traneapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/* Created by pavlo.harkavii on 5/12/2016.*/

public class SearchVerificationTest {
    private WebDriver driver = new ChromeDriver();
    private SearchPage searchPage = new SearchPage(driver);
    private SearchPage resultTable;
    private SearchPage searchButton;

    @Before
    public void loadPage() {
        driver.get("http://booking.uz.gov.ua/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.navigate().refresh();
    }

    // Verify that table with results are displayed
    // Verify that table contains necessary train numbers

    @Test
    public void searchVerificationTest() {
        searchPage.searchFrom("Kyiv");
        searchPage.searchTill("Ivano-Frankivsk");
        searchPage.addDateDeparture();
        new WebDriverWait(driver, 3);
        searchPage.clickSearchButton();
        new WebDriverWait(driver, 3);
        Assert.assertEquals("table", searchPage.getTextOfTag());
        Assert.assertEquals("115 О", searchPage.getTextOfItem());
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}
