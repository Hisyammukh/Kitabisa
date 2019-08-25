package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class summaryPage{

    @FindBy(xpath = "//h2[contains(text(),'Instruksi Pembayaran')]")
    public WebElement txtInstruksiPembayaran;

    
}