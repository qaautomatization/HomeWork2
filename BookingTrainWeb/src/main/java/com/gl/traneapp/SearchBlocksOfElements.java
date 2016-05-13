package com.gl.traneapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/* Created by pavlo.harkavii on 5/12/2016.*/

@Name("Search form")
@FindBy(xpath = "//form[@name='train_search_form']")
public class SearchBlocksOfElements extends HtmlElement {

    @Name("Search request input Departure")
    @FindBy(name = "station_from")
    private TextInput requestInputDeparture;

    @Name("Combo list item under input Departure")
    @FindBy(xpath = "//input[@name='station_from']/../div[@id='stations_from']/div[@title='Kyiv']")
    private WebElement itemUnderInputDeparture;

    @Name("Search request input Destination")
    @FindBy(name = "station_till")
    private TextInput requestInputDestination;

    @Name("Combo list item under input Destination")
    @FindBy(xpath = "//input[@name='station_till']/../div[@id='stations_till']/div[@title='Ivano-Frankivsk']")
    private WebElement itemUnderInputDestination;

    @Name("Departure date request input")
    @FindBy(id = "date_dep")
    private WebElement requestInputDepartureDate;

    @Name("Departure date item")
    @FindBy(xpath = "//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]//a")
    private WebElement departureDateItem;

    @Name("Search for trains button")
    @FindBy(name = "search")
    private WebElement searchButton;

    public void searchFrom(String request) {
        requestInputDeparture.sendKeys(request);
       // (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(itemUnderInputDeparture));
        itemUnderInputDeparture.click();
    }

    public void searchTill(String request) {
        requestInputDestination.sendKeys(request);
       // (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(itemUnderInputDestination));
        itemUnderInputDestination.click();
    }

    public void addDateDeparture() {
        requestInputDepartureDate.click();
       // (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(departureDateItem));
        departureDateItem.click();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    @Name("result Table")
    @FindBy(xpath = "//div[@id='ts_res']/table")
    private WebElement resultTable;

    public String getTextOfTag() {
        return resultTable.getTagName();
    }

    @Name("result Item")
    @FindBy(xpath = "//div[@id='ts_res']/table/tbody/tr/td[1]/a")
    public WebElement resultItem;

    public String getTextOfItem() {
        return resultItem.getText();
    }

}
