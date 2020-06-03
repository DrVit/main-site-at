package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchTab extends BasePage {

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

    public SearchTab(WebDriver driver) {
        super(driver);
    }

    public Page checkCount(String getCount) {
        switch (getCount) {

            case "professions": {
                professionsCount.getText();
                break;
            }
            case "courses": {
                coursesCount.getText();
                break;
            }
            case "webinars": {
                webinarsCount.getText();
                break;
            }
            case "blogs": {
                blogsCount.getText();
                break;
            }
            case "forums": {
                forumsCount.getText();
                break;
            }
            case "tests": {
                testsCount.getText();
                break;
            }
            default: {
                throw new NotFoundException("Element not found " + getCount);
            }
        }
        return new Page(driver);
    }
}