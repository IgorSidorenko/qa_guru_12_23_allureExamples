import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureExamplesTests extends TestBase {
    @Test
    @AllureId("11575")
    @DisplayName("Поиск страницы в Wikipedia")
    @Owner("allure8")
    @Tag("test")
    public void testGithubAuth() {
        step("Откройте страницу");
        step("Нажать авторизоваться");
        step("Ввести логин");
        step("Ввести пароль");
        step("Ввести в поле поиска selenide и нажать Enter");
    }

    @Test
    @AllureId("11576")
    @DisplayName("Открыть страницу в Wikipedia")
    @Owner("allure8")
    @Tag("test")
    public void testGithubOpenPage() {
        step("Откройте страницу");
        step("Нажать авторизоваться");
        step("Ввести логин");
        step("Ввести пароль");
    }
}