package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement _depositButton;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement _amountToBeDeposited;
    @FindBy(xpath = " //body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement _depositTab;
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement _depositSuccessfulText;
    @FindBy(xpath = " customerLoginPage.clickOnLoginButton();")
    WebElement _withdrawalTab;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]" )
    WebElement _amountToBeWithDraw;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]" )
    WebElement _withDrawButton;
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement _transactionSuccessfulText;

    //method to enter Amount to be deposited
    public void enterAmountToBeDeposited(String amount) {
        Reporter.log("Enter amount " + amount + "to amount Field " + _amountToBeDeposited.toString() + "<br>");
        log.info("Enter amount " + amount + "to amount Field " + _amountToBeDeposited.toString());
        sendTextToElement(_amountToBeDeposited, amount);
    }
    //method to click on deposit button
    public void clickOnDepositButton() {
        Reporter.log("Clicking on Deposit Button" + _depositButton.toString() + "<br>");
        log.info("Clicking on Deposit Button" + _depositButton.toString());
        clickOnElement(_depositButton);
    }
    //method to click on deposit link
    public void clickOnDepositLink() {
        Reporter.log("Clicking on Deposit Link." + _depositTab.toString() + "<br>");
        log.info("Clicking on Deposit Link." + _depositTab.toString());
        clickOnElement(_depositTab);
    }
    //method to get deposit successful text
    public String getDepositSuccessfulText() {

        return getTextFromElement(_depositSuccessfulText);
    }
    //method to click on withdraw tab
    public void clickOnWithDrawTab() {
        Reporter.log("Clicking on WithDraw Button." + _withdrawalTab.toString() + "<br>");
        log.info("Clicking on WithDraw Button." + _withdrawalTab.toString());
        clickOnElement(_withdrawalTab);
    }
    //method to enter amount to be withdraw
    public void enterAmountToBeWithDraw(String amount) {
        Reporter.log("Enter amount " + amount + "to amount Field " + _amountToBeWithDraw.toString() + "<br>");
        log.info("Enter amount " + amount + "to amount Field " + _amountToBeWithDraw.toString());
        sendTextToElement(_amountToBeWithDraw, amount);
    }
    //method to click withdraw button
    public void clickOnWithDrawButton() {
        Reporter.log("Clicking on Deposit Link." + _withDrawButton.toString() + "<br>");
        log.info("Clicking on Deposit Link." + _withDrawButton.toString());
        clickOnElement(_withDrawButton);
    }
    //method to get transaction successful text
    public String getTransactionSuccessfulText(){
        return getTextFromElement(_transactionSuccessfulText);
    }
}
