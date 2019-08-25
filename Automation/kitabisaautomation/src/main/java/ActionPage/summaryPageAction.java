package ActionPage;

import static Config.config.driver;

import org.openqa.selenium.support.PageFactory;

import Config.config;
import ObjectRepository.summaryPage;

public class summaryPageAction extends summaryPage{

    config conf = new config();

    public summaryPageAction() {
        PageFactory.initElements(driver, this);
    }

    public String valPembayaran() throws InterruptedException{
        return txtInstruksiPembayaran.getText();
    }
}