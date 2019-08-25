package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.config;

public class donationForm{
    
    //Ammount
    @FindBy(id = "target-donasi")
    public WebElement txtBoxAmmount;

    //Dropdown Payment Method
    @FindBy(xpath = "//span[@class='text-bold text-12 small-margin-right']")
    public WebElement paymentMethod;

    //Transfer BNI selected
    @FindBy(xpath = "//li[4]")
    public WebElement trfBNI;

    //Name
    @FindBy(id="Donations_donorName")
    public WebElement donationName;

    //Email or WA
    @FindBy(id="emailOrPhone")
    public WebElement donationEmailOrPhone;

    //Payment Button
    @FindBy(xpath = "//button[@class='btn btn--large btn--pink btn--block js-submit-donate ins-init-condition-tracking']")
    public WebElement btnPayment;

    //isRelationLabel
    @FindBy(css = ".form__row--alt")
    public WebElement Relational;

    //isRelationTidakButton
    @FindBy(xpath = "//*[@id='yw0']/div[1]/div[8]/div/div/div/div[1]/label")
    public WebElement YesRelation;





    
    
}