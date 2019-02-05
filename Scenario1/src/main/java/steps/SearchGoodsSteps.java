package steps;

import pages.SearchGoodsPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Алексей on 04.02.2019.
 */
public class SearchGoodsSteps {

    @Step("указана минимальная цена {0}")
    public void stepEnterMinPrice(String price) {
        new SearchGoodsPage().enterMinPrice(price);
    }

    @Step("выбран производитель {0}")
    public void stepSelectManufacturer(String mfr) {
        new SearchGoodsPage().selectManufacturer(mfr);
    }

    @Step("установлено количество элементов на странице {0}")
    public void stepSelectQuantityOfElements(int elements) {
        new SearchGoodsPage().selectQuantityOfElements(elements);
    }

    @Step("проверено количество элементов на странице {0}")
    public void stepAssertQuantityOfElements(int elements) {
        new SearchGoodsPage().assertQuantityOfElements(elements);
    }

    @Step("запомнен {0} телевизор в списке")
    public String stepRememberTelevisor(int element) {
        return new SearchGoodsPage().rememberTelevisor(element);
    }

    @Step("запомнены {0} наушники в списке")
    public String stepRememberHeadset(int element) {
        return new SearchGoodsPage().rememberHeadset(element);
    }

    @Step("в поисковую строку введено запомненное значение {0}")
    public void stepEnterValueToSearchLine(String value) {
        new SearchGoodsPage().enterValueToSearchLine(value);
    }

    @Step("найдено и проверено соответствие наименования телевизора запомненному значению {1}")
    public void stepAssertFoundTelevisor(String rememberValue) {
        new SearchGoodsPage().assertFoundTelevisor(rememberValue);
    }

    @Step("найдено и проверено соответствие наименования наушников запомненному значению {1}")
    public void stepAssertFoundHeadset(String rememberValue) {
        new SearchGoodsPage().assertFoundHeadset(rememberValue);
    }
}
