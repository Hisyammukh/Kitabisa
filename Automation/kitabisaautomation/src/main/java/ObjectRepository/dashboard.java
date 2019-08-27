package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dashboard{

    @FindBy(xpath = "//h3[contains(text(),'Bantu Siapa Hari Ini?')]")
    public WebElement txtBantuSiapa;

    //@FindBy(xpath = "//*[@id='react-home-root']/section[3]/div/a[1]/div")
    //public WebElement firstCampaign;

    //@FindBy(xpath = "//*[@id='home_listcard_campaign-135581']/div[1]")
    //public WebElement nonOrganizationCampaign;

    @FindBy(css = "#home_listcard_campaign-135581")
    public WebElement nonOrganizationCampaign;
    
    
    
    @FindBy(xpath= "//*[@id='react-home-root']/section[3]/div/a[5]/div")
    public WebElement firstCampaign;
    //*[@id="campaign-detail_button_donasi-sekarang"]

    @FindBy(css = ".style__ButtonContainer-wl3991-11 kPJaVS")
    public WebElement btnDonasi;
}
