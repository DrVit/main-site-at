package ru.geekbrains.main.site.at.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorTab extends BasePage {

    @FindBy(css = "#top-menu > .gb-header__content > h2.gb-header__title")
    private WebElement headerMain;

    @FindBy(css = "nav > a[href = '/courses']")
    private WebElement coursesNavButton;

    @FindBy(css = "a#cour-link.text-dark-dk")
    private WebElement coursesInsButton;

    @FindBy(css = "#filter-0")
    private WebElement checkBoxFree;

    @FindBy(css = "#filter-9")
    private WebElement checkBoxTests;

    @FindBy(css = "a[href='/courses/85']")
    private WebElement searchTests1;

    @FindBy(css = "a[href='/courses/84']")
    private WebElement searchTests2;


    public AuthorTab(WebDriver driver) {
        super(driver);
    }

    public AuthorTab searchHeaderMain() {
        String headMainSearch = headerMain.getText();
        Assertions.assertEquals("Главная", headMainSearch);

        return this;
    }

    public AuthorTab searchHeaderMain1() {
        String headMainSearch = headerMain.getText();
        Assertions.assertEquals("Главная", headMainSearch);

        coursesNavButton.click();
        coursesInsButton.click();
        checkBoxFree.click();
        checkBoxTests.click();

        Assertions.assertTrue(searchTests1.isDisplayed());
        Assertions.assertTrue(searchTests2.isDisplayed());

        return this;
    }

}
