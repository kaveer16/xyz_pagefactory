package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    @FindBy(xpath = "//select[@id='userSelect']" )
    WebElement _yourNameLink;
    @FindBy(xpath = "//button[contains(text(),'Login')]" )
    WebElement _loginButton;
    @FindBy(xpath = "//span[contains(text(),'kaveer kumar')]" )
    WebElement _kaveerKumarText;
    @FindBy(xpath = "//button[contains(text(),'Logout')]"  )
    WebElement _logOutButton;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]" )
    WebElement _yourNameText;

    //method to select your name
    public void selectYourName(){
        Reporter.log("select your name" + _yourNameLink.toString() + "<br>");
        log.info("select your name" + _yourNameLink.toString());
        clickOnElement(By.xpath("//option[contains(text(),'kaveer kumar')]"));
    }
    public void clickOnLoginButton() {
        Reporter.log("Clicking on Add Customer Button." + _loginButton.toString() + "<br>");
        log.info("Clicking on Add Customer Button." + _loginButton.toString());
        clickOnElement(_loginButton);
    }
    public String getKaveerkumarText() {

        return getTextFromElement(_kaveerKumarText);
    }
    public void clickOnLogOutButton() {
        Reporter.log("Clicking on Add Customer Button." + _logOutButton.toString() + "<br>");
        log.info("Clicking on Add Customer Button." + _logOutButton.toString());
        clickOnElement(_logOutButton);
    }
    public String getYourNameText(){
        return getTextFromElement(_yourNameText);
    }

}
