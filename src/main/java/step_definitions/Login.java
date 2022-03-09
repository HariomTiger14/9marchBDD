package step_definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class Login {

WebDriver driver;
	
@Given("^the user opens the browser \"(.*)\"$")
public void selectbrowser(String name)
{
	if (name.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "/Users/hariombhatia/Downloads/chromedriver3");
		driver = new ChromeDriver();	
	}
	
	else
	{
		System.out.println("No such browser supported.");
	}
}

@Given("^the user opens the website \"(.*)\"$")
public void openwebsite(String website)
{
	driver.get(website);
	driver.manage().window().maximize();
}


@Given("^the user quits the browser$")
public void quitbrowser()
{
	driver.quit();
}

@Given("^the user opens the browser$")
public void openbrowser2(DataTable browser)
{	
	List<String> data = browser.asList();
	if (data.get(0).equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "/Users/hariombhatia/Downloads/chromedriver 3");
	driver = new ChromeDriver();
}
}

//Taking data from data table as List of lists
@Given("^the user opens the website$")
public void openwebsite2(DataTable website) throws InterruptedException
{
	
	List<List<String>> data1 = website.asLists(String.class);
	for (List<String> e : data1)
	{
		System.out.println(e);
	}
	for (int i = 0; i<data1.size(); i++)
	{
	driver.get(data1.get(i).get(0));
	Thread.sleep(5000);
	}
}

//Taking data from data table as List of Maps
@Given("^the user opens the website2$")
public void openwebsite3(DataTable website) throws InterruptedException
{
	
	List<Map<String,String>> data2 = website.asMaps(String.class, String.class);
	for (Map<String,String> e : data2)
	{
		System.out.println(e);
		driver.get(e.get("website"));
		Thread.sleep(5000);
	}
}



}
