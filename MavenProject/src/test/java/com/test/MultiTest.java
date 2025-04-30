package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;

public class MultiTest {

    WebDriver driver;

    @BeforeClass
    public void Initialization()
    {

         driver = new ChromeDriver();//RTP

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

    }

    @Test(priority = 1)
    public void SelectDropDown()
    {

        WebElement countrylist = driver.findElement(By.id("country"));

        Select sel = new Select(countrylist);

        sel.selectByIndex(5);

        sel.selectByValue("brazil");

        sel.selectByVisibleText("India");


    }

    @Test(priority = 2)
    public void AdvanceDropDown()
    {


        WebElement countrylist = driver.findElement(By.id("country"));


        Select sel = new Select(countrylist);

        List<WebElement> li = sel.getOptions();


        //driver.findElements(null)

        System.out.println(li.size());

        for(int i =0 ; i<li.size() ; i++) //0
        {
            li.get(i).click();
            System.out.println(li.get(i).getText());
        }



    }

    @AfterClass
    public void CleanUp()
    {
        driver.quit();
    }



}
