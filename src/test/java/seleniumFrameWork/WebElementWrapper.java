package seleniumFrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementWrapper extends Locator {
		
	private String getElement() {
		return this.getLocator();
	}
	
	WebElementWrapper(String resourceLocator){
		System.out.println("calling Super class");
		super.setLocator(resourceLocator);
		System.out.println("Done");
	}
}
