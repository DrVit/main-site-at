package ru.geekbrains.main.site.at.base;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.page.content.TestsPage;
import ru.geekbrains.main.site.at.view.LeftNavigation;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка навигации")
@Feature("Проверка навигации")
public class NavigationTest extends BaseTest  {
        static LeftNavigation.Button[] stringProvider() { return LeftNavigation.Button.values(); }

        @DisplayName("Нажатие навигации")
        @ParameterizedTest(name = "{index} => переход на страницу {0}")
        @MethodSource("stringProvider")
        void checkNavigation(LeftNavigation.Button button) {
            new TestsPage(driver)
                    .openUrl()
                    .getLeftNavigation().clickButton(button)
                    .getHeader().checkNamePage(button.getName());

        }
}
