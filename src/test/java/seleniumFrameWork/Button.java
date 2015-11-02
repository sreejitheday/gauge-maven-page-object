package seleniumFrameWork;

import org.openqa.selenium.WebElement;

public class Button extends AbstractElement {
	
	public String getLocator() {		 
		return super.getLocator();
	}

	public Button(String locator) {
		super.setLocator(locator);			
	}
			
	ResourceLocator resourceLoc = new ResourceLocator();
		
	private WebElement getElement(String buttonName_) {
		
		return resourceLoc.getElementResouce(buttonName_);
	}	
	
	public void click() {
		
		getElement(getLocator()).click();
	}
	
	public boolean isElementPresent() {
		
		boolean isElementPresent = false;
		if(getElement(getLocator()) != null)
			isElementPresent = true;
		
		return isElementPresent;
	}
	
	
	public String getText() {
		
		return getElement(getLocator()).getText();
	}	
}
