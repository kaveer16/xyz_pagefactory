package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    WebElement _customerLoginLink;
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]" )
    WebElement _bankManagerLoginLink;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement _addCustomerText;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]" )
    WebElement _clickAddCustomerButton;
    @FindBy(xpath = " //body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement _clickOnOpenAccountTab;

    public void clickOnCustomerLoginLink(){
        Reporter.log("Clicking On CustomerLogin Link" + _customerLoginLink.toString() + "<br>");
        log.info("Clicking On CustomerLogin Link" + _customerLoginLink.toString());
        clickOnElement(_customerLoginLink);
    }
    public void clickOnBankManagerLoginLink(){
        Reporter.log("Clicking on Bank Manager Login Link." + _bankManagerLoginLink.toString() + "<br>");
        log.info("Clicking on Bank Manager Login Link." + _bankManagerLoginLink.toString());
        clickOnElement(_bankManagerLoginLink);
    }
    public String getAddCustomerText(){
        return getTextFromElement(_addCustomerText);

    }
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on Add Customer Button." + _clickAddCustomerButton.toString() + "<br>");
        log.info("Clicking on Add Customer Button." + _clickAddCustomerButton.toString());
        clickOnElement(_clickAddCustomerButton);
    }
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking on Open Account Tab " + _clickOnOpenAccountTab.toString() + "<br>");
        log.info("Clicking on Open Account Tab " + _clickOnOpenAccountTab.toString());
        clickOnElement(_clickOnOpenAccountTab);
    }
}
