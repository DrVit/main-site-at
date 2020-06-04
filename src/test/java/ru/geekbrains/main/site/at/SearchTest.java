package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.pages.SearchTab;

import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTest {

    @BeforeEach

    public void openSite() {
        driver.get(BASE_URL + "/courses");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/button[*]")).click();


        WebElement searchButton = driver.findElement(By.cssSelector("ul > li >.show-search-form"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("java");
    }

    @Test
    public void searchTabTest() {
        new SearchTab(driver)
                .searchAssertion()
                .checkTab();
    }

}
