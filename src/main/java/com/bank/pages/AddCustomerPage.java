package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]" )
    WebElement _firstNameField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement _lastNameField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]" )
    WebElement _postCodeField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]" )
    WebElement _addCustomerButton;

    // method to enter first name
    public void enterFirstName(String firstName){
        Reporter.log("Enter First Name" + _firstNameField.toString() + "<br>");
        log.info("Enter First Name" + _firstNameField.toString() );
        sendTextToElement(_firstNameField,firstName);
    }
    //method to enter last name
    public void enterLastName(String lastName) {
        Reporter.log("Enter First Name" + _lastNameField.toString() + "<br>");
        log.info("Enter First Name" + _lastNameField.toString());
        sendTextToElement(_lastNameField, lastName);
    }
    //method to enter postcode
    public void enterPostcode(String postcode){
        Reporter.log("Enter Postcode " + _postCodeField.toString() + "<br>");
        log.info("Enter Postcode " + _postCodeField.toString());
        sendTextToElement(_postCodeField,postcode);
    }
    //method to click on add customer button
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on add customer button" + _addCustomerButton.toString() + "<br>");
        log.info("Clicking on add customer button" + _addCustomerButton.toString());
        clickOnElement(_addCustomerButton);
    }

}
