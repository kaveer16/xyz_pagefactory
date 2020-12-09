package com.bank.pages;

import com.bank.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']" )
    WebElement _customerLink;
    @FindBy(xpath = "//select[@id='currency']" )
    WebElement _currencyLink;
    @FindBy(xpath = "//button[contains(text(),'Process')]"  )
    WebElement _processButton;

    public void selectCustomer(String name) {
        Reporter.log("select name of customer" + _customerLink.toString() + "<br");
        log.info("select name of customer" + _customerLink.toString());
       sendTextToElement(_customerLink,name);
    }
    public void selectCurrency(String currency){
        Reporter.log("select currency" + _currencyLink.toString() + "<br>");
        log.info("select currency" + _currencyLink.toString());
        sendTextToElement(_currencyLink,currency);
    }
    public void clickOnProcessButton(){
        Reporter.log("clicking on process button" + _processButton.toString() + "<br>");
        log.info("clicking on process button" + _processButton.toString());
        clickOnElement(_processButton);
    }
}
