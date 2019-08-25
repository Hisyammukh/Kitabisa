package ActionPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import static Config.config.driver;

import java.util.List;

import Config.config;
import ObjectRepository.donationForm;

public class donationFormAction extends donationForm{

    config conf = new config();
    
    public donationFormAction() {
        PageFactory.initElements(driver, this);
    }

    public void typeTxtBoxAmmount(){
        txtBoxAmmount.sendKeys("20000");
    }

    public void clickPaymentMethod(){
        paymentMethod.click();
    }

    public void clickTrfBNI(){
        trfBNI.click();
    }

    public void txtBoxName(){
        donationName.sendKeys("Hisyam");
    }

    public void clickEmailOrWa(){
        donationEmailOrPhone.sendKeys("hisyam@gmail.com");
    }

    
    public void clickBtnPayment(){
        btnPayment.click();
    }
    
    public boolean RelationCampaignDisplayed(){
        if(Relational.isDisplayed()){
        return true;
        }
		return false;
    }

    public boolean isRelationDisplayed(){
        return YesRelation.isDisplayed();
    }

    public void RelationCampaign(){
        YesRelation.click();
        
    }
    /*

    public boolean valCampaignRelation() {
        
        if(Relational.isDisplayed()){
            System.out.println("DISPLAYED");
            return true;
 
        }
        System.out.println("NOT DISPLAYED"); 
       return false;
    }
    */

    /*
    public void clickCampaignRelation(){
        try {
        if (Relational.isDisplayed()) {
            System.out.println("DISPLAYED");
            YesRelation.click();
            btnPayment.click();
        }
        else{
            System.out.println("NOT DISPLAYED");
            btnPayment.click();
        }
    }
    catch (Exception e){
        
    }

    }
    */
    

    
    

}