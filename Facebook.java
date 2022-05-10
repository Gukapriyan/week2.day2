package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Gukan");
		driver.findElement(By.name("lastname")).sendKeys("priyan");
		driver.findElement(By.name("reg_email__")).sendKeys("agukapriyan@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("agukapriyan@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("spi");
		WebElement date = driver.findElement(By.id("day"));
		Select dd1=new Select(date);
		dd1.selectByValue("2");
		WebElement month =driver.findElement(By.id("month"));
		Select dd2=new Select(month);
		dd2.selectByValue("7");
		WebElement year =driver.findElement(By.id("year"));
		Select dd3=new Select(year);
		dd3.selectByValue("2000");
		

	}

}


