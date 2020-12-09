package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement _clickAddCustomerButton;
    @FindBy(xpath = " //body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement _clickOnOpenAccountTab;

    //method to click on add customer button
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on Add Customer Button." + _clickAddCustomerButton.toString() + "<br>");
        log.info("Clicking on Add Customer Button." + _clickAddCustomerButton.toString());
        clickOnElement(_clickAddCustomerButton);
    }
    //method to click on open account tab
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking on Open Account Tab " + _clickOnOpenAccountTab.toString() + "<br>");
        log.info("Clicking on Open Account Tab " + _clickOnOpenAccountTab.toString());
        clickOnElement(_clickOnOpenAccountTab);
    }
}
