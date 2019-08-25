package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dashboard{

    @FindBy(xpath = "//h3[contains(text(),'Bantu Siapa Hari Ini?')]")
    public WebElement txtBantuSiapa;

    @FindBy(xpath = "//*[@id='react-home-root']/section[3]/div/a[1]/div")
    public WebElement firstCampaign;

    
    @FindBy(xpath= "//*[@id='react-home-root']/section[3]/div/a[5]/div")
    public WebElement nonOrganizationCampaign;

    @FindBy(linkText = "DONASI SEKARANG")
    public WebElement btnDonasi;
}
