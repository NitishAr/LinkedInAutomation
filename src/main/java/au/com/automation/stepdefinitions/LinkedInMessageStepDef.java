package au.com.automation.stepdefinitions;

import au.com.automation.helper.LoggerHelper;
import au.com.automation.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class LinkedInMessageStepDef  {

 String name ="";

    Logger log = LoggerHelper.getLogger(LinkedInMessageStepDef.class);
    @Given("User navigates to Application URL")
    public void userNavigatesToApplicationURL() throws InterruptedException {
       LoginPage.navigateToURL();
    }


    @And("^User logged in  with valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoggedInWithValidAnd(String userName, String password) throws Throwable {
        LoginPage.enterLoginDetails(userName, password);
    }

    @When("^User search for valid \"([^\"]*)\"$")
    public void userSearchForValid(String userProdfile) throws Throwable {
        name= HomePage.getUserNameValue();
        HomePage.seacrhUserProfile(userProdfile);
        HomePage.clickUserProfile();
        //HomePage.clickMessageButton();
    }

    @And("^User sends the text message \"([^\"]*)\" and logged out from the application$")
    public void userSendsTheTextMessageAndLoggedOutFromTheApplication(String textMessage) throws Throwable {
        textMessage =textMessage.replace("username",name );
        System.out.println("username is " + name);
        UserProfilePage.sendMessage(textMessage);
        CommonPage.signOut();

    }

    @Then("^User should successfully logged out from the application$")
    public void userShouldSuccessfullyLoggedOutFromTheApplication() {
        String title = CommonPage.getTitle();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("title of the page is " +title);
        Assert.assertEquals(title,"LinkedIn: Log In or Sign Up", "Title Verified");

    }

   /* @When("^I enter the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",<Other Income>\"([^\"]*)\"<Living Expenses>\"([^\"]*)\"<Other Home Repayment>\"([^\"]*)\"<Other Loan Repayment>\"([^\"]*)\"<Other Commitments>\"([^\"]*)\"<Total Credit>\"$")
    public void iEnterTheFollowingDetailsOtherIncomeLivingExpensesOtherHomeRepaymentOtherLoanRepaymentOtherCommitmentsTotalCredit(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
        borrowerCalulator1.enterIncomeDetails(arg0,arg1);
    }*/

 /*   @When("I enter the following details {string},{string},{string},{string},<Other Income>{string}<Living Expenses>{string}<Other Home Repayment>{string}<Other Loan Repayment>{string}<Other Commitments>{string}<Total Credit>\"")
    public void iEnterTheFollowingDetailsOtherIncomeLivingExpensesOtherHomeRepaymentOtherLoanRepaymentOtherCommitmentsTotalCredit(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        borrowerCalulator1.enterIncomeDetails(arg0,arg1);
    }*/

   /* @And("I click button {string}")
    public void iClickButtonWorkOutHowMuchICouldBorrow() {
    }

    @Then("I should see borrowing estimates")
    public void iShouldSeeBorrowingEstimates() {
    }*/
}
