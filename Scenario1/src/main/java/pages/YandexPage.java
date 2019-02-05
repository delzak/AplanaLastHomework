package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Алексей on 04.02.2019.
 */
public class YandexPage extends BasePageObject{

    @FindBy (linkText = "Маркет")
    WebElement market;

    public void selectMarket() {
        market.click();
    }
}
