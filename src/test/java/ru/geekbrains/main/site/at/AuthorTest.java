package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.pages.AuthorTab;

import java.util.concurrent.TimeUnit;

public class AuthorTest extends BaseTest {
    @BeforeEach

    public void openSite() {
        driver.get(BASE_URL + "/login");

        WebElement searchLogin = driver.findElement(By.cssSelector("#user_email"));
        searchLogin.sendKeys("hao17583@bcaoo.com");

        WebElement searchPass = driver.findElement(By.cssSelector("#user_password"));
        searchPass.sendKeys("hao17583");

        WebElement searchInButton = driver.findElement(By.cssSelector(".form-group > .btn"));
        searchInButton.click();

    }

    @Test
    public void searchPageTest() {
        new AuthorTab(driver)
                .searchHeaderMain()
                .searchHeaderMain1();
    }
}
