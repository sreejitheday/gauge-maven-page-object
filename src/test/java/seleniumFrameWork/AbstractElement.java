package seleniumFrameWork;

public abstract class AbstractElement {
	
	private String locator;
	
	public void setLocator(String locator) {
		this.locator = locator;
	}
	
	public String getLocator() {
		return locator;
	}
}
