package steps;

import pages.YandexPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Алексей on 04.02.2019.
 */
public class YandexSteps {

    @Step("выбран раздел Маркет")
    public void stepSelectMarket() {
        new YandexPage().selectMarket();
    }
}
