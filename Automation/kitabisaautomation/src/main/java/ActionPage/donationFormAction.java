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

    public void clickTrfBCA(){
        trfBCA.click();
    }

    public void clickTrfBNI(){
        trfBNI.click();
    }

    public void clickTrfBNIS(){
        trfBNIS.click();
    }

    public void clickTrfBRI(){
        trfBRI.click();
    }
    
    public void clickTrfMandiri(){
        trfMandiri.click();
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
    
    public boolean isRelationDisplayed(){
        return YesRelation.isDisplayed();
    }

    public void RelationCampaign(){
        YesRelation.click();
        
    }

    

    
    

}