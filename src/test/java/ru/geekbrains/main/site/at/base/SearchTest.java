package ru.geekbrains.main.site.at.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.page.content.TestsPage;
import ru.geekbrains.main.site.at.view.SearchTabsView;

import static org.hamcrest.Matchers.*;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка работы поиска")
public class SearchTest extends BaseTest {

    @DisplayName("Проверка поиска")
    @Test
    void searchTest() {
        new TestsPage(driver)
                .openUrl()
                .getHeader()
                .searchText("Java")
                .getSearchTabView()
                .checkCount(SearchTabsView.Tab.Professions, greaterThanOrEqualTo(2))
                .checkCount(SearchTabsView.Tab.Courses, greaterThan(15))
                .checkCount(SearchTabsView.Tab.Webinars, allOf(greaterThan(180), lessThan(300)))
                .checkCount(SearchTabsView.Tab.Blogs, greaterThan(300))
                .checkCount(SearchTabsView.Tab.Forums, not(350))
                .checkCount(SearchTabsView.Tab.Tests, not(0));

    }
}
