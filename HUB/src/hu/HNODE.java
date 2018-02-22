package hu;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class HNODE {
		static WebDriver driver;
		static String baseurl;
		static String nodeurl;
		
		@Test
		public static void asd() throws MalformedURLException
		{
			//nodeHub
			nodeurl="http://10.102.51.136:5666/wd/hub";
			new DesiredCapabilities();
			DesiredCapabilities t = DesiredCapabilities.firefox();
			t.setBrowserName("firefox");
			t.setPlatform(Platform.WINDOWS);
			driver= new RemoteWebDriver(new URL (nodeurl),t);
			//test
			
	
	
	
	
	
	

	
	//public static void main(String[] args) {
		 //TODO Auto-generated method stub

	   driver  = new FirefoxDriver();
	    baseurl = "https://demo.opencart.com/";
	    driver.get(baseurl + "/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	    //
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    if(driver.findElement(By.cssSelector("p.text-center")).getText().contentEquals("Your shopping cart is empty!"))
	    {
	    	System.out.println("Shopping Cart Empty Verified");
	    }
	    	else
	    	{
	    	System.out.println("Error:Shopping Cart Empty Validation Failed");
	    	}
	
	    //click on Contact Us Symbol
	    driver.findElement(By.cssSelector("i.fa.fa-phone")).click();
	    if(driver.findElement(By.cssSelector("#content > h1")).getText().contentEquals("Contact Us"))
	    {
	    	System.out.println("Contact US Heading Verified");
	    }
	    	else
	    	{
	    	System.out.println("Error:Contact US Heading Validation Failed");
	    	}
	    //
	   if(driver.findElement(By.xpath("//div[@id='content']/div/div/div/div[2]/strong")).getText().contentEquals("Telephone"))
		    {
		    	System.out.println("Telephone Verified");
		    }
		    else
		    {
		    	System.out.println("Telephone Validation Failed");
		    }
	   //
	   if(driver.findElement(By.xpath("//div[@id='content']/div/div/div/div[2]")).getText().contentEquals("Telephone\n123456789"))
			{
			   System.out.println("Telephone Number Verified");
			 }
			else
			{
			System.out.println("Error:Telephone Number Validation Failed");
			}
	   

	   
	   		driver.findElement(By.id("input-name")).clear();
	   		driver.findElement(By.id("input-name")).sendKeys("Krishna");
	   		driver.findElement(By.id("input-email")).clear();
	   		driver.findElement(By.id("input-email")).sendKeys("adad.com");
	   		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		   if(driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[2]/div/div")).getText().contentEquals("E-Mail Address does not appear to be valid!"))
				{
				   System.out.println("InValid Email Validation Verified");
				 }
				else
				{
				System.out.println("Error:InValid Email Validation Failed");
				}

		   
		    driver.findElement(By.id("input-email")).clear();
		    driver.findElement(By.id("input-email")).sendKeys("krishnakanth24@live.com");
		    driver.findElement(By.id("input-enquiry")).clear();
		    driver.findElement(By.id("input-enquiry")).sendKeys("This is capgem testing");
		    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		    driver.findElement(By.linkText("Continue")).click();
		    driver.findElement(By.linkText("Brands")).click();

			   if(driver.findElement(By.cssSelector("#content > h1")).getText().contentEquals("Find Your Favorite Brand"))
					{
					   System.out.println("Find Your Brand Heading Verified");
					 }
					else
					{
					System.out.println("Find Your Brand Heading Failed");
					}
		  driver.findElement(By.linkText("Sony")).click();

		   if(driver.findElement(By.cssSelector("p.price")).getText().contentEquals("$1,202.00\nEx Tax: $1,000.00"))
				{
				   System.out.println("Price Verified");
				 }
				else
				{
				System.out.println("Price Verification Failed");
				System.out.println(driver.findElement(By.cssSelector("p.price")).getText());
				}
		    driver.findElement(By.cssSelector("div.button-group > button[type=\"button\"]")).click();

		    try {
				Thread.sleep(3000);
				   if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().contentEquals("Success: You have added Sony VAIO to your shopping cart!\n�"))
						{
						   System.out.println("Product Added Validation Verified");
						 }
						else
						{
						System.out.println("Product Added Validation Failed");
						}
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    //System.out.println(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText());
	}
}

