package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {

    @Test
    public void searchJavaTest(){

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
        Assertions.assertTrue(coursesTab.isDisplayed());
        Assertions.assertTrue(webinarsTab.isDisplayed());
        Assertions.assertTrue(blogsTab.isDisplayed());
        Assertions.assertTrue(forumsTab.isDisplayed());
        Assertions.assertTrue(testsTab.isDisplayed());

        /* Assertions.assertTrue(countProfession >= 2);
        Assertions.assertTrue(countCourses > 15);
        Assertions.assertTrue(countWebinars > 180 & countWebinars < 300);
        Assertions.assertTrue(countBlogs > 300);
        Assertions.assertTrue(countForums != 350);
        Assertions.assertTrue(countTests != 0);*/


        assertThat(countProfession, greaterThanOrEqualTo(2));
        assertThat(countCourses, greaterThan(15));
        assertThat(countWebinars, allOf(greaterThan(180), lessThan(300)));
        assertThat(countBlogs, greaterThan(300));
        assertThat(countForums, not(equalTo(350)));
        assertThat(countTests, not(equalTo(0)));

        System.out.println();


          }



}
