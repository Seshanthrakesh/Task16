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
		driver.findElement(By.linkText("Home")).click();//find home 
		driver.close();						   		//Close the browser
	}

}
