package com.gl.traneapp;

/* Created by pavlo.harkavii on 5/12/2016.*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class SearchPage {

    public SearchPage(WebDriver driver){
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    private SearchBlocksOfElements searchBlocksOfElements;
    public  SearchBlocksOfElements resultItem;
    private SearchBlocksOfElements resultTable;
    private SearchBlocksOfElements searchButton;

    public String getTextOfItem(){
        return searchBlocksOfElements.getTextOfItem();
    }

    public void searchFrom(String request){
        searchBlocksOfElements.searchFrom(request);
    }

    public void searchTill(String request){
        searchBlocksOfElements.searchTill(request);
    }

    public void addDateDeparture(){
        searchBlocksOfElements.addDateDeparture();
    }

    public void clickSearchButton(){
        searchBlocksOfElements.clickSearchButton();
    }

    public String getTextOfTag(){
        return searchBlocksOfElements.getTextOfTag();
    }


}
