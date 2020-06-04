package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Page extends BasePage {

    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;

    private NavigationTab navigationTab;

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

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
    }


    public Page checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    public NavigationTab getNavigationTab() {
        return navigationTab;
    }

    public Page searchAssertion() {
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


//    public Page checkTab(String expected1){
//
//        int countCheckTab = Integer.parseInt(expected1);
//        assertThat(countCheckTab, greaterThanOrEqualTo(2));
//
//        return this;
//    }

}
