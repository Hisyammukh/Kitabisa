package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Config.config;

public class scroll extends config{

    public static void scrollToElement(WebElement element) {
		
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
	}
    
}