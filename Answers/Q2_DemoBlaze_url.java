/*Q2.Write a seleNium scripts to open the Chrome browser ,maximizes the browser window,navigates to the https://demoblaze.com .
 * Verifies the title of the page is "STORE".prints"age Landed on the Correct website "if the title matches 
 * else Print "Page not Landed on the Correct website"
 */
package com.Task16.Answers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_DemoBlaze_url {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();		//Opens the Chrome Browser
		driver.get("https://demoblaze.com/");		//Navigate to demoblaze Url
		driver.manage().window().maximize();		//maximize the current window
		String pagetitle =driver.getTitle();		//Get the page title
		if(pagetitle.equals("STORE")) 				//Verifies whether Page title is "STORE" 
			System.out.println("Page Landed on the Correct website");
		else
			System.out.println("Page not Landed on the Correct website");
		driver.findElement(By.linkText("Home")).click();//find home Link
		driver.close();					   		//Close the browser;
	}

}
