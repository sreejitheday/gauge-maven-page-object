package seleniumFrameWork;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class BasePage {

	protected boolean isPageInitialized;

	protected static String webAppUrl = "https://www.gmail.com";
	protected static String brows;
	private HashMap<String, String> htmlLocators;
	private String locator;
	private Yaml yaml;
	private InputStream in;
			
	ResourceLocator resourceLocator = new ResourceLocator();
	WebElementWrapper wrapper;
	
	protected void getHtmlResourceLocators(Object pageClass) {
		yaml = new Yaml();
		String dataSource = "./Asset/" + pageClass.getClass().getSimpleName() + ".yaml";
		try {
			in = new FileInputStream(dataSource);
			htmlLocators = (HashMap<String, String>) yaml.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}			
	}

	protected void initialiazePageObjects(Object pageClass) {
		
		Field[] pageElements = pageClass.getClass().getDeclaredFields();

		try {
			for(Field field: pageElements){
//				field.set(pageClass, new WebElementWrapper(htmlLocators.get(field.getName())));

				Class<?> dataMemberClass = Class.forName(field.getType().getName());
				Class<?> argumnts[] = new Class[1];
				argumnts[0] = String.class;

				Constructor<?> constructor = dataMemberClass.getConstructor(argumnts);
				Object[] constructorArgList = new Object[1];
				constructorArgList[0] = new String(htmlLocators.get(field.getName()));

				Object obj1 = constructor.newInstance(constructorArgList);
				field.set(pageClass, obj1);
			}				
		}
		
		catch (Exception e) {
			 e.printStackTrace();
		}	
	}	
}
