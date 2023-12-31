/*Q3.Write a seleNium scripts to open the Chrome browser ,maximizes the browser window,navigates to the "https://www.wikipedia.org/"
 * Searches for the query "Artificial Intelligence".Clicks on the "history" section in the search results .and prints the title of the 
 * section*/
package com.Task16.Answers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_wikipedia_org {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();				//Opens the Chrome Browser
		driver.get("https://en.wikipedia.org/");			//Navigate to wikipedia url
		driver.manage().window().maximize();				//maximize the current window
		WebElement wb=driver.findElement(By.name("search"));//Finds the search bar 
		wb.sendKeys("Artificial Intelligence");				//type 'Artificial Intelligence' 
		wb.submit();										//submits input in the search bar
		WebElement w= driver.findElement(By.linkText("History"));//find the history link
		w.click();												//click the link
		String title=driver.findElement(By.id("firstHeading")).getText();//Get the title of the section
		System.out.println("The Title of Section : "+title);	//Print the title of the section
		driver.close();											//close the browser
	}

}
