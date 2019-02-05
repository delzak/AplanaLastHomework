package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Алексей on 04.02.2019.
 */
public class MarketSteps {

    @Step("выбран раздел маркета {0}")
    public void stepSelectMarketMenu(String menuItem) {
        new MarketPage().selectMarketMenu(menuItem);
    }

    @Step("выбран подраздел {0}")
    public void stepSelectMarketSubMenu(String subMenuItem) {
        new MarketPage().selectMarketSubMenu(subMenuItem);
    }
}
