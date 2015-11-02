package seleniumFrameWork;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;

public class TextField extends AbstractElement {
	
		ResourceLocator resourceLoc = new ResourceLocator();
				
		public String getLocator() {		 
			return super.getLocator();
		}
	
		public TextField(String locator) {
			super.setLocator(locator);			
		}
								
		private WebElement getElement(String textFieldName_) {
			
			return resourceLoc.getElementResouce(textFieldName_);
		}		
		
		
		public void setTextField(String text_) {

			System.out.println("Text: " + text_);
			System.out.println("Locator: " + getLocator());
			WebElement textField = getElement(getLocator());
			textField.clear();
			textField.sendKeys(text_);			
		}
		
		public WebElement getTextField() {
			
			return getElement(getLocator());						
		}
		
		public boolean isElementPresent() {
			
			boolean isElementPresent = false;
			if(getElement(getLocator()) != null)
				isElementPresent = true;
			
			return isElementPresent;
		}		
		
		public String getText(String textFieldName_) {
			
			return getElement(getLocator()).getText();
		}
}


