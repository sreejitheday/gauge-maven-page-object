package seleniumFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResourceLocator extends DriverFactory {
	
	String locator;

	
	private String[] getLocatorDetails(String locator) {
		
		String[] element = new String[2];
				
		if(locator.startsWith("//")) {
			
			element[0] = "xpath";
			element[1] = locator;
		}
		
		else if(locator.contains("=")) {			
			element = locator.split("=");			
		}		
					
		return element; 
	}

		
	public WebElement getElementResouce(String htmlLocator) {
		
		String[] htmlSourceLocator = null;
		WebElement element = null;						

		htmlSourceLocator = getLocatorDetails(htmlLocator);
						
		if(htmlSourceLocator[0].equalsIgnoreCase("id"))
			element = getDriver().findElement(By.id(htmlSourceLocator[1]));
		
		else if(htmlSourceLocator[0].equalsIgnoreCase("name"))
			element = getDriver().findElement(By.name(htmlSourceLocator[1]));
		
		else if(htmlSourceLocator[0].equalsIgnoreCase("xpath"))
			element = getDriver().findElement(By.xpath(htmlSourceLocator[1]));
			
		else if(htmlSourceLocator[0].equalsIgnoreCase("link"))
			element = getDriver().findElement(By.linkText(htmlSourceLocator[1]));
				
		else if(htmlSourceLocator[0].equalsIgnoreCase("partiallink"))
			element = getDriver().findElement(By.partialLinkText(htmlSourceLocator[1]));
					
		else if(htmlSourceLocator[0].equalsIgnoreCase("tagname"))
			element = getDriver().findElement(By.tagName(htmlSourceLocator[1]));
						
		else if(htmlSourceLocator[0].equalsIgnoreCase("css"))
			element = getDriver().findElement(By.cssSelector(htmlSourceLocator[1]));
							
		else if(htmlSourceLocator[0].equalsIgnoreCase("class"))
			element = getDriver().findElement(By.className(htmlSourceLocator[1]));
										
		return element;
	}
}