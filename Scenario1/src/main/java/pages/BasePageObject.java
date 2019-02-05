package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by Алексей on 04.02.2019.
 */
public class BasePageObject {

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value);
    }

    public void forceWait(int times, WebElement locator, String value) {
        for (int i=0; i < times; i++) {
            fillField(locator, value);
        }
    }

    public void waitElement(WebElement locator) {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(locator));
        wait.until(ExpectedConditions.elementToBeSelected(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
