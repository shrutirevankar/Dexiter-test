package com.dexiter.ui.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchContent {
	
		
		static WebDriver driver;
		
		public SearchContent(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public static WebElement searchTextBox()
		{
			WebElement searchTextBox = driver.findElement(By.id("lst-ib"));
			return searchTextBox;
		}

		public static WebElement searchButton()
		{
			WebElement searchButton = driver.findElement(By.name("btnK"));
			return searchButton;
		}
		
		
	}


