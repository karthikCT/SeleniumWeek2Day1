package week2.day1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Find Contacts")).click();
//driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[2]/em[1]/span[1]/span[1]")).click();
//driver.findElement(By.xpath("//span[text()='Email']")).click();
driver.findElement(By.linkText("Email")).click();
driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
driver.findElement(By.className("x-btn-text")).click();
driver.close();
	}

}
