package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

/**
 * Created by Алексей on 04.02.2019.
 */
public class SearchGoodsPage extends BasePageObject{

    @FindBy(xpath = "//p/input[@name='Цена от']")
    WebElement minPrice;

    @FindBy(xpath = "//ul[@class='_2y67xS5HuR']")
    WebElement manufacturer;

    @FindBy(xpath = "//button[@role='listbox']")
    WebElement sizeButton;

    @FindBy(xpath = "//div[@class='select__list']")
    WebElement size;

    @FindBy(xpath = "//div[@class='n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited']")
    WebElement searchTelevisors;

    @FindBy(xpath = "//div[@class='n-filter-applied-results__content preloadable i-bem preloadable_js_inited']/div")
    WebElement searchHeadsets;

    @FindBy(id = "header-search")
    WebElement searchField;

    @FindBy(xpath = "//span[@class='search2__button']/button")
    WebElement findButton;

    @FindBy(xpath = "//h1[@class='title title_size_28 title_bold_yes']")
    WebElement foundTelevisor;

    public void enterMinPrice(String price) {
        fillField(minPrice, price);
    }

    public void selectManufacturer(String mfr) {
        manufacturer.findElement(By.xpath(".//span[text()='" + mfr +"']/..")).click();
    }

    public void selectQuantityOfElements(int elements) {
        sizeButton.click();
        size.findElement(By.xpath(".//span[text()='Показывать по " + elements + "']")).click();
    }

    public void assertQuantityOfElements(int elements) {
        assertEquals("Показывать по " + elements, sizeButton.getText());
    }

    public String rememberTelevisor(int element) {
//здесь приходится добавлять ожидание, т.к. во время прогрузки найденных товаров выбирается неправильный первый элемент
        forceWait(3, searchField, "Здесь могла быть ваша реклама");

        String rememberElement = searchTelevisors.findElement(
           By.xpath("./div[" + element + "]//div[@class='n-snippet-card2__title']/a")).getText();
        System.out.println("Запомнен первый элемент = " + rememberElement);
        return rememberElement;
    }

    public void enterValueToSearchLine(String value) {
        fillField(searchField, value);
        findButton.click();
    }

    public void assertFoundTelevisor(String rememberValue) {
        assertEquals(rememberValue, foundTelevisor.getText());
    }

    public String rememberHeadset(int element) {
//здесь приходится добавлять ожидание, т.к. во время прогрузки найденных товаров выбирается неправильный первый элемент
        forceWait(3, searchField, "Здесь могла быть ваша реклама");

        String rememberElement = searchHeadsets.findElement(
                By.xpath("./div[" + element + "]//div[@class='n-snippet-cell2__title']/a")).getText();
        System.out.println("Запомнен первый элемент = " + rememberElement);
        return rememberElement;
    }

    public void assertFoundHeadset(String rememberValue) {
        assertEquals(rememberValue, searchHeadsets.findElement(By.xpath(
                "//a[@title='" + rememberValue + "']")).getAttribute("title"));
    }

}
