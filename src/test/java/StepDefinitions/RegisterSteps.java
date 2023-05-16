package StepDefinitions;

import Pages.Elements;
import Pages.Parent;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import static Pages.Parent.rndGmail;

public class RegisterSteps extends BaseDriver {



   Elements e=new Elements();


    @Given("Navigate to website")
    public void navigate_to_website() {
     BaseDriver.getDriver().get("https://cleverppc.com/prestashop4/");
     BaseDriver.getDriver().manage().window().maximize();

    }

    @When("Sign in button click")
    public void sign_in_button_click() {
        e.clickFunction(e.signIn);

    }

    @And("Enter an email and click Create an account button")
    public void enter_an_email_and_click_create_an_account_button() {
        String randomEmail= Parent.rndGmail();
        e.sendKeysFunction(e.emailInput,randomEmail);
       e.clickFunction(e.createBtn);
    }
    @When("Click an radio button")
    public void clickAnRadioButton() {
        e.clickFunction(e.radioBtn);
    }


    @And("Enter firstname and lastname")
    public void enter_firstname_and_lastname() {
        e.sendKeysFunction(e.firstName,"Halime");
        e.sendKeysFunction(e.lastName,"Efe");
    }


    @And("Enter password and date of birth")
    public void enter_password_and_date_of_birth() {
        e.sendKeysFunction(e.passwd,"Techno777");
        e.clickFunction(e.day);
        e.clickFunction(e.months);
        e.clickFunction(e.years);
    }

    @When("Click register button")
    public void click_register_button() {
      e.clickFunction(e.registerBtn);
    }

    @Then("Verify successfully registered")
    public void verify_successfully_registered() {
        e.verifyContainsTextFunction(e.verify,"created");
    }


    @And("Verify successfully login")
    public void verifySuccessfullyLogin() {
        e.verifyContainsTextFunction(e.logout,"Sign out");


    }

    @Then("log out Website")
    public void logOutWebsite() {
        e.clickFunction(e.logout);
    }
}