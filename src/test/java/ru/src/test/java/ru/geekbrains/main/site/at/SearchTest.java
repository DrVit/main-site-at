package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTest {

    @Test
    void searchJavaTest(){

        driver.get(BASE_URL + "/courses");
        System.out.println("");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/button[*]")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("ul > li >.show-search-form"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("java");

        WebElement professionsTab = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='professions']"));
        WebElement professionsCount = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='professions'] span"));
        int countProfession = Integer.parseInt(professionsCount.getText());

        WebElement coursesTab = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='courses']"));
        WebElement coursesCount = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='courses'] span"));
        int countCourses = Integer.parseInt(coursesCount.getText());

        WebElement webinarsTab = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='webinars']"));
        WebElement webinarsCount = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='webinars'] span"));
        int countWebinars = Integer.parseInt(webinarsCount.getText());

        WebElement blogsTab = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='blogs']"));
        WebElement blogsCount = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='blogs'] span"));
        int countBlogs = Integer.parseInt(blogsCount.getText());

        WebElement forumsTab = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='forums']"));
        WebElement forumsCount = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='forums'] span"));
        int countForums= Integer.parseInt(forumsCount.getText());

        WebElement testsTab = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='tests']"));
        WebElement testsCount = driver.findElement(By.cssSelector(".search-page-tabs li > a[data-tab='tests'] span"));
        int countTests= Integer.parseInt(testsCount.getText());

        Assertions.assertTrue(professionsTab.isDisplayed());
        Assertions.assertTrue(countProfession >= 2);
        Assertions.assertTrue(coursesTab.isDisplayed());
        Assertions.assertTrue(countCourses > 15);
        Assertions.assertTrue(webinarsTab.isDisplayed());
        Assertions.assertTrue(countWebinars > 180 & countWebinars < 300);
        Assertions.assertTrue(blogsTab.isDisplayed());
        Assertions.assertTrue(countBlogs > 300);
        Assertions.assertTrue(forumsTab.isDisplayed());
        Assertions.assertTrue(countForums != 350);
        Assertions.assertTrue(testsTab.isDisplayed());
        Assertions.assertTrue(countTests != 0);

        System.out.println();


          }

}
