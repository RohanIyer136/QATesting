package com.selenium.projectjob;

import static org.junit.Assert.*;
//import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.jupiter.api.Assertions.assertEquals;
 
public class SeleniumProjectNew {
	@Test
    public void eightComponents() {
		String[] usernames = {"standard_user",
				"locked_out_user"
				,"problem_user"};
		int size = usernames.length;
		String password_val = new String("secret_sauce");
		//System.setProperty("webdriver.chrome.driver", "/home/rohan_iyer/Desktop/Selenium/chromedriver");
		
		for(int i = 0; i<size; i++) {
			WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        WebElement username=driver.findElement(By.id("user-name"));
	        WebElement password=driver.findElement(By.id("password"));
	        WebElement login=driver.findElement(By.name("login-button"));
	        username.sendKeys(usernames[i]);
	        password.sendKeys(password_val);
	        login.click();
	        driver.quit();
		}
        

        /*String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        WebElement textBox = driver.findElement(By.name("my-text"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        textBox.sendKeys("Selenium");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        String value = message.getText();
        assertEquals("Received!", value);

        driver.quit();*/
        
    }
}