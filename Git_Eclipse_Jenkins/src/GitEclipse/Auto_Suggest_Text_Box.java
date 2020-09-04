package GitEclipse;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggest_Text_Box {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Reporter.log("Chrome Browser Launched");
	    driver.get("https://google.co.in");
	    Thread.sleep(4000);
	    Reporter.log("Application Launched");

	    //1st Process
		/*driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(5000);*/
		driver.findElement(By.name("q")).sendKeys("testing");
		Reporter.log("Enter the some value in Google Search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//2nd Process
		List<WebElement> text = driver.findElements(By.cssSelector("ul[class='erkvQe'] "));
        for(WebElement element : text) {
        System.out.println(element.getText());
        Reporter.log("Printed All Links");
        if(element.getText().contains("testing jobs"))
        element.click();
        Thread.sleep(4000);
        element.click();
        System.out.println("------------------------------");
        System.out.println("Crossed the Click");
        break;
 
	        }
        Thread.sleep(10000);
        driver.close();
        Reporter.log("Driver closed");

}
}