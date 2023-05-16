package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{

    public Elements(){
        PageFactory.initElements(BaseDriver.getDriver(),this);

    }

    @FindBy(css = "[class='login']")
    public WebElement signIn;

    @FindBy(css = "[id='email_create']")
    public WebElement emailInput;

    @FindBy(css = "[id='SubmitCreate']")
    public WebElement createBtn;

    @FindBy(css = "[id='id_gender2']")
    public WebElement radioBtn;

    @FindBy(css = "[id='customer_firstname']")
    public WebElement firstName;

    @FindBy(css = "[id='customer_lastname']")
    public WebElement lastName;

    @FindBy(css = "[id='passwd']")
    public WebElement passwd;

    @FindBy(css = "select#days option:nth-child(7)")
    public WebElement day;

    @FindBy(css = "select#months option:nth-child(4)")
    public WebElement months;

    @FindBy(css = "select#years option[value='1979']")
    public WebElement years;

    @FindBy(css = "[id='submitAccount']>span")
    public WebElement registerBtn;

    @FindBy(css = "[class='alert alert-success']")
    public WebElement verify;

    @FindBy(css = "[class='logout']")
    public WebElement logout;


}
