package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProgram {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ch Dharma\\eclipse-workspace\\Project\\drivers\\chromedriver.exe ");
      WebDriver drive = new ChromeDriver();
      drive.get(" https://www.facebook.com/");
//     String title = drive.getTitle();
//     System.out.println(title);
     String currentUrl = drive.getCurrentUrl();
     System.out.println(currentUrl);
     drive.manage().window().maximize();
////     drive.quit();
     String title = drive.getTitle();
     System.out.println(title);
   
   }
}
