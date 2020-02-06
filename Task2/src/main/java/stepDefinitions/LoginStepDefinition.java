package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{

	 WebDriver driver;
String keyword;
	/*
	 * Launching the webpage
	 */
	 @Given("^Navigate to Expedia Page$")
	 public void launch_browser(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	 driver = new ChromeDriver();
	 driver.get("https://www.expedia.com/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[contains(text(),'Bundle and Save')]//parent::button")).click();
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 
	 
	 /*
	  * Providing the source and destinations
	  */
	 
	 @Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void enter_and(String source,String destination){
		 
	driver.findElement(By.xpath("//span[text()='Flight + Hotel']//following::input[@placeholder='City or airport' and @data-station_code_element='package-origin-hp-package-station_code']")).sendKeys(source);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//span[text()='Flight + Hotel']//following::input[@placeholder='Hotel name, city or airport' ]")).sendKeys(destination);

	 }
	 
	 /*
	  * Providing the to date and from date
	  */

	 @When("^select from and to date$")
	 public void select_from_and_to_date(){
	
		 driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		 driver.findElement(By.xpath("//td//button[@data-year='2020' and @data-month='1' and @data-day='14']")).click();
		 driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
		 driver.findElement(By.xpath("//td//button[@data-year='2020' and @data-month='2' and @data-day='2']")).click();
	 }
	
	
	 @Then("^select travellers and click on search$")
	 public void select_travellers_and_click_on_search() throws IOException {
		 Actions a=new Actions(driver);
			
			a.sendKeys(Keys.TAB,Keys.ENTER,Keys.TAB,Keys.ENTER).build().perform();
			a.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
			a.sendKeys(Keys.TAB,Keys.ENTER).build().perform();
			a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
			 driver.findElement(By.id("search-button-hp-package")).click();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		 }
	 @Then("^verify result page contains the destination$")
	 public void verify_result_page_contains_the_destination(){
	//driver.close();
		 System.out.println("The destination page has"+driver.findElement(By.xpath("//button[@class='destination fakeLink']//parent::span")).getText());
		 Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'New York, New York, United States of America')]")).getText().contains("New York"));	 }
	
	 @Then("^close browser$")
	 public void close_browser(){
	//driver.close();
	 }
	 
	 

	
	

}
