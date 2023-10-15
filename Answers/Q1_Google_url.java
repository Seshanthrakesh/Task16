/*Q1.Write a seleNium scripts to open the fireFox browser ,maximizes the browser window,navigates to the https://www.google.com.prints 
 * the Url of the current page ,reloads the page and closes the browser
 */
package com.Task16.Answers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Q1_Google_url {
	public static void main(String[] args) throws Exception  {
		WebDriver driver=new FirefoxDriver();		//opens the FireFox browser
		driver.manage().window().maximize();		//Maximize the browser window
		driver.get("https://www.google.com/");		//Navigate the url-google.com
		System.out.println(driver.getCurrentUrl());	//prints the current page url 	
		driver.navigate().refresh();				//reload the page
		driver.close();								//close the browser
	}
}
