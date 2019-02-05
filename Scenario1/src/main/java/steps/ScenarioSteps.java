package steps;

import cucumber.api.java.en.When;

/**
 * Created by Алексей on 04.02.2019.
 */
public class ScenarioSteps {
    YandexSteps yandexSteps = new YandexSteps();
    MarketSteps marketSteps = new MarketSteps();
    SearchGoodsSteps searchGoodsSteps = new SearchGoodsSteps();
    String elementOfSearch;

    @When("^осуществлен переход на страничку Маркет$")
    public void stepSelectMarket() {
        yandexSteps.stepSelectMarket();
    }

    @When("^выбран раздел маркета \"(.*)\"$")
    public void stepSelectMarketMenu(String menuItem) {
        marketSteps.stepSelectMarketMenu(menuItem);
    }

    @When("^выбран подраздел маркета \"(.*)\"$")
    public void stepSelectMarketSubMenu(String subMenuItem) {
        marketSteps.stepSelectMarketSubMenu(subMenuItem);
    }

    @When("^указана минимальная цена \"(.*)\"$")
    public void stepEnterMinPrice(String price) {
        searchGoodsSteps.stepEnterMinPrice(price);
    }

    @When("^выбран производитель \"(.*)\"$")
    public void stepSelectManufacturer(String mfr) {
        searchGoodsSteps.stepSelectManufacturer(mfr);
    }

    @When("^установлено количество элементов на странице \"(.*)\"$")
    public void stepSelectQuantityOfElements(int elements) {
        searchGoodsSteps.stepSelectQuantityOfElements(elements);
    }

    @When("^проверено количество элементов на странице \"(.*)\"$")
    public void stepAssertQuantityOfElements(int elements) {
        searchGoodsSteps.stepAssertQuantityOfElements(elements);
    }

    @When("^запомнен \"(.*)\" телевизор в списке$")
    public void stepRememberTelevisor(int element) {
        elementOfSearch = searchGoodsSteps.stepRememberTelevisor(element);
    }

    @When("^запомнены \"(.*)\" наушники в списке$")
    public void stepRememberHeadset(int element) {
        elementOfSearch = searchGoodsSteps.stepRememberHeadset(element);
    }

    @When("^в поисковую строку введено запомненное значение$")
    public void stepEnterValueToSearchLine() {
        searchGoodsSteps.stepEnterValueToSearchLine(elementOfSearch);
    }

    @When("^найдено и проверено, что наименование телевизора соответствует запомненному значению$")
    public void stepAssertFoundTelevisor() {
        searchGoodsSteps.stepAssertFoundTelevisor(elementOfSearch);
    }

    @When("^найдено и проверено, что наименование наушников соответствует запомненному значению$")
    public void stepAssertFoundHeadset() {
        searchGoodsSteps.stepAssertFoundHeadset(elementOfSearch);
    }
}
