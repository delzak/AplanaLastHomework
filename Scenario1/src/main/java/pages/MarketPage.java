package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Алексей on 04.02.2019.
 */
public class MarketPage extends BasePageObject{

    @FindBy(xpath = "//div[@class='n-w-tabs__horizontal-tabs-background']")
    WebElement marketMenu;

    @FindBy(xpath = "//div[@data-452ecda2='true']")
    WebElement marketSubMenu;

    public void selectMarketMenu(String menuItem) {
        marketMenu.findElement(By.xpath(
                ".//span[text()='" + menuItem + "']")).click();
    }

    public void selectMarketSubMenu(String subMenuItem) {
        marketSubMenu.findElement(By.xpath(".//a[text()='" + subMenuItem +"']")).click();
    }
}
