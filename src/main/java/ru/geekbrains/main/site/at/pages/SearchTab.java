package ru.geekbrains.main.site.at.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class SearchTab extends BasePage {
    @FindBy(css = ".search-page-tabs li > a[data-tab='professions'] span")
    private WebElement professionsCount;
    @FindBy(css = ".search-page-tabs li > a[data-tab='courses'] span")
    private WebElement coursesCount;
    @FindBy(css = ".search-page-tabs li > a[data-tab='webinars'] span")
    private WebElement webinarsCount;
    @FindBy(css = ".search-page-tabs li > a[data-tab='blogs'] span")
    private WebElement blogsCount;
    @FindBy(css = ".search-page-tabs li > a[data-tab='forums'] span")
    private WebElement forumsCount;
    @FindBy(css = ".search-page-tabs li > a[data-tab='tests'] span")
    private WebElement testsCount;

    @FindBy(css = ".search-page-tabs li > a[data-tab='professions']")
    private WebElement professionsTab;
    @FindBy(css = ".search-page-tabs li > a[data-tab='courses']")
    private WebElement coursesTab;
    @FindBy(css = ".search-page-tabs li > a[data-tab='webinars']")
    private WebElement webinarsTab;
    @FindBy(css = ".search-page-tabs li > a[data-tab='blogs']")
    private WebElement blogsTab;
    @FindBy(css = ".search-page-tabs li > a[data-tab='forums']")
    private WebElement forumsTab;
    @FindBy(css = ".search-page-tabs li > a[data-tab='tests']")
    private WebElement testsTab;


    public SearchTab(WebDriver driver) {
        super(driver);
    }

    public SearchTab searchAssertion() {
        int countProfession= Integer.parseInt(professionsCount.getText());
        int countCourses= Integer.parseInt(coursesCount.getText());
        int countWebinars= Integer.parseInt(webinarsCount.getText());
        int countBlogs= Integer.parseInt(blogsCount.getText());
        int countTests= Integer.parseInt(testsCount.getText());
        int countForums= Integer.parseInt(forumsCount.getText());

        assertThat(countProfession, greaterThanOrEqualTo(2));
        assertThat(countCourses, greaterThan(15));
        assertThat(countWebinars, allOf(greaterThan(180), lessThan(300)));
        assertThat(countBlogs, greaterThan(300));
        assertThat(countForums, not(equalTo(350)));
        assertThat(countTests, not(equalTo(0)));
        return this;
    }
    public SearchTab checkTab() {
        Assertions.assertTrue(professionsTab.isDisplayed());
        Assertions.assertTrue(coursesTab.isDisplayed());
        Assertions.assertTrue(webinarsTab.isDisplayed());
        Assertions.assertTrue(blogsTab.isDisplayed());
        Assertions.assertTrue(forumsTab.isDisplayed());
        Assertions.assertTrue(testsTab.isDisplayed());
        return this;
    }

}