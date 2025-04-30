package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdvanceDropDown {


	@Test
	public void test4(){
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();//RTP
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement countrylist = driver.findElement(By.id("country"));
		
		
		Select sel = new Select(countrylist);
		
		List<WebElement>li = sel.getOptions();
		
		
		//driver.findElements(null)
		
		System.out.println(li.size());
		
		for(int i =0 ; i<li.size() ; i++) //0 
		{
			li.get(i).click();
			System.out.println(li.get(i).getText()); 
		}

	}

}
