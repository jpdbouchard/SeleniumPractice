package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {

	public static void main(String[] args) {
		String baseURL = "http://www.google.ca";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\JP\\eclipse-workspace\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JP\\eclipse-workspace\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\JP\\eclipse-workspace\\MicrosoftWebDriver.exe");
		
		
		WebDriver firefox;
		firefox = new FirefoxDriver();
		firefox.manage().window().maximize();
		firefox.get(baseURL);
		firefox.quit();

		WebDriver chrome;
		chrome = new ChromeDriver();
		chrome.get(baseURL);
		chrome.quit();
		
		WebDriver edge;
		edge = new EdgeDriver();
		edge.get(baseURL);
		edge.quit();
		
	}
}
