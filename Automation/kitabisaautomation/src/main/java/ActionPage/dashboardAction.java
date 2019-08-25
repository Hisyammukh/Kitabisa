package ActionPage;

import static Config.config.driver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Config.config;
import ObjectRepository.dashboard;
import Utils.scroll;

public class dashboardAction extends dashboard{

    config conf = new config();
	Actions action = new Actions(driver);
	
    scroll scroll = new scroll();

        public dashboardAction() {
            PageFactory.initElements(driver, this);
        }
        
        
    public void scrolltoBanner() throws InterruptedException {
        Thread.sleep(2000);
        scroll.scrollToElement(txtBantuSiapa);
        }
 

    public void clickNonOrganizationCampaign(){
        nonOrganizationCampaign.click();
    }

    public void clickBtnDonasi(){
        btnDonasi.click();
    }

}