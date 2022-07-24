import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureManualTests {
    @Test
    @AllureId("11565")
    @DisplayName("Test demo link")
    @Owner("allure8")
    void testDemoLink() {
        step("Opening the page");
        step("Scrolling to the bottom of the page");
        step("Clicking the About Us link");
        step("Checking the About Us header");
    }
    @Test
    @AllureId("11566")
    @DisplayName("Поиск страницы в Github")
    @Owner("allure8")
    void SearchPageGithub(){
        step("Open page  Github");
        step("Scrolling to the bottom of the page");
        step("Clicking the About Us link");
        step("Checking the About Us header");
}
}
