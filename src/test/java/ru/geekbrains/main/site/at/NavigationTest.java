package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.pages.NavigationTab;

import java.util.stream.Stream;

@Execution(value = ExecutionMode.CONCURRENT)
public class NavigationTest extends BaseTest {

    @BeforeEach
    public void openSite() {
        driver.get(BASE_URL + "/career");
    }

    @ParameterizedTest
    @DisplayName("check navigation items")
    @MethodSource("pageGenerator")
    public void navigationPanelTest(String buttonTitle) {
        new NavigationTab(driver)
                .clickButton(buttonTitle)
                .checkHeader(buttonTitle);
    }

    public static Stream<String> pageGenerator() {
        return Stream.of("Карьера", "Тесты", "Блог", "Форум", "Вебинары", "Курсы");
    }

//    private String header;
//
//
//    @Test
//        public void navigationPageCareerTest() {
//
//        System.out.println("Стартует тест страницы 'Карьера'");
//        driver.get(BASE_URL + "/career");
//
//        driver.findElement(By.cssSelector("nav > a[href = '/career']")).click();
//
//        header = driver.findElement(By.className("gb-header__title")).getText();
//        Assertions.assertEquals("Карьера", header);
//        WebElement footerCareer = driver.findElement(By.className("site-footer__content"));
//        Assertions.assertTrue(footerCareer.isDisplayed());
//    }
//    @Disabled
//    @Test
//        void navigationPageCoursesTest() {
//
//            System.out.println("Стартует тест страницы 'Курсы'");
//            driver.get(BASE_URL + "/courses");
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.findElement(By.xpath("//div/div/button[*]")).click();
//
//            driver.findElement(By.cssSelector("nav.gb-left-menu__nav .svg-icon.icon-courses")).click();
//
//            header = driver.findElement(By.className("gb-header__title")).getText();
//            Assertions.assertEquals("Курсы", header);
//
//            WebElement footerCourses = driver.findElement(By.className("site-footer__content"));
//            Assertions.assertTrue(footerCourses.isDisplayed());
//        }
//    @Disabled
//    @Test
//    void navigationPageTestsTest() {
//
//        System.out.println("Стартует тест страницы 'Тесты'");
//        driver.get(BASE_URL + "/tests");
//
//        driver.findElement(By.cssSelector("nav > a[href = '/tests']")).click();
//
//        header = driver.findElement(By.className("gb-header__title")).getText();
//        Assertions.assertEquals("Тесты", header);
//        WebElement footerCareer = driver.findElement(By.className("site-footer__content"));
//        Assertions.assertTrue(footerCareer.isDisplayed());
//    }
//    @Disabled
//    @Test
//    void navigationPageEventsTest() {
//
//        System.out.println("Стартует тест страницы 'Вебинары'");
//        driver.get(BASE_URL + "/events");
//
//        driver.findElement(By.cssSelector("nav > a[href = '/events']")).click();
//
//        header = driver.findElement(By.className("gb-header__title")).getText();
//        Assertions.assertEquals("Вебинары", header);
//        WebElement footerCareer = driver.findElement(By.className("site-footer__content"));
//        Assertions.assertTrue(footerCareer.isDisplayed());
//    }
//    @Disabled
//    @Test
//    void navigationPageTopicsTest() {
//
//        System.out.println("Стартует тест страницы 'Форум'");
//        driver.get(BASE_URL + "/topics");
//
//        driver.findElement(By.cssSelector("nav > a[href = '/topics']")).click();
//
//        header = driver.findElement(By.className("gb-header__title")).getText();
//        Assertions.assertEquals("Форум", header);
//        WebElement footerCareer = driver.findElement(By.className("site-footer__content"));
//        Assertions.assertTrue(footerCareer.isDisplayed());
//    }
//    @Disabled
//    @Test
//    void navigationPagePostsTest() {
//
//        System.out.println("Стартует тест страницы 'Блог'");
//        driver.get(BASE_URL + "/posts");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div/div/button[*]")).click();
//
//        driver.findElement(By.cssSelector("nav > a[href = '/posts']")).click();
//
//        header = driver.findElement(By.className("gb-header__title")).getText();
//        Assertions.assertEquals("Блог", header);
//        WebElement footerCareer = driver.findElement(By.className("site-footer__content"));
//        Assertions.assertTrue(footerCareer.isDisplayed());
//    }
//   /* public static Stream<String> stringGenerator() {
//        return Stream.of("career", "courses", "tests",);
//    }
//    @ParameterizedTest
//    @MethodSource("stringGenerator")
//    public void test01(String title) {
//        assertNotNull(title);
//    } */
//   @ParameterizedTest
//   @CsvFileSource(resources = "/testsources01.csv", numLinesToSkip = 1)
//
//   protected void test01(String a, String b) {
//       driver.get(BASE_URL +"/" + a);
//       String c = "nav > a[href = '/" + a +"']";
//       driver.findElement(By.cssSelector(c)).click();
//
//       header = driver.findElement(By.className("gb-header__title")).getText();
//       assertEquals(b,header);
//       WebElement footerCourses = driver.findElement(By.className("site-footer__content"));
//       Assertions.assertTrue(footerCourses.isDisplayed());
//
//   }
//    @ParameterizedTest
//    @CsvFileSource(resources = "/testsources02.csv", numLinesToSkip = 1)
//
//    protected void test02(String a, String b) {
//        driver.get(BASE_URL +"/" + a);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div/div/button[*]")).click();
//        String c = "nav > a[href = '/" + a +"']";
//        driver.findElement(By.cssSelector(c)).click();
//
//        header = driver.findElement(By.className("gb-header__title")).getText();
//        /*Assertions.assertEquals("Курсы", header);*/
//        assertEquals(b,header);
//        WebElement footerCourses = driver.findElement(By.className("site-footer__content"));
//        Assertions.assertTrue(footerCourses.isDisplayed());
//
//    }

}
