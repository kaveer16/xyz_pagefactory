package com.bank.testsuite;
import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;

    @BeforeMethod(groups = {"sanity","smoke","regression"})

    public void setUp(){
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        accountPage = new AccountPage();
    }


    @Test(groups = {"sanity","regression"})
    public void bankMangerShouldAddCustomerSuccessfully(){

        homePage.getAddCustomerText();
        bankManagerLoginPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName("Kaveer");
        addCustomerPage.enterLastName("kumar");
        addCustomerPage.enterPostcode("WD250PQ");
        addCustomerPage.clickOnAddCustomerButton();

    }

    @Test(groups = {"sanity","regression"})
    public void bankMangerShouldOpenAccountSuccessfully()  {
        homePage.clickOnBankManagerLoginLink();
        homePage.clickOnOpenAccountTab();
        int num = getRandomNumeric();
        openAccountPage.selectCustomer("kaveer kumar" + num);
        openAccountPage.selectCurrency("pounds");
        openAccountPage.clickOnProcessButton();

    }

    @Test(groups = {"sanity","smoke","regression"})
    public void customerShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnCustomerLoginLink();

        customerLoginPage.selectYourName();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.getKaveerkumarText();
        customerLoginPage.clickOnLogOutButton();
        String expectedMessage = "Your Name";
        String actualMessage = customerLoginPage.getYourNameText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginLink();
        int num = getRandomNumeric();
        customerLoginPage.selectYourName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmountToBeDeposited("100");
        accountPage.clickOnDepositLink();
        accountPage.getDepositSuccessfulText();
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getDepositSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @Test(groups = {"smoke","regression"})
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLoginLink();
        customerLoginPage.selectYourName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithDrawTab();
        accountPage.enterAmountToBeWithDraw("50");
        accountPage.clickOnWithDrawButton();
        accountPage.getTransactionSuccessfulText();
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getTransactionSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
