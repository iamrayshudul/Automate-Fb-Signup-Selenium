package facebook.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpSystem {
	public void fbSignUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.facebook.com/reg/");
		String webUrl=driver.getCurrentUrl();
		if (webUrl.equals("https://www.facebook.com/reg/")){
			System.out.println("You are landed on the correct URL");
		} else {
			System.out.println("You are landed on the Wrong URL");
		}
		driver.findElement(By.name("firstname")).sendKeys("Write first name"); //Write your first name
		driver.findElement(By.name("lastname")).sendKeys("Write last name"); //Write your last name
		driver.findElement(By.name("reg_email__")).sendKeys("write email"); //write email
		driver.findElement(By.name("reg_passwd__")).sendKeys("write password"); //write password
		Select s=new Select(driver.findElement(By.xpath("//*[@name='birthday_day']")));
		s.selectByVisibleText("7"); //Replace birth date 
		Select s1=new Select(driver.findElement(By.xpath("//*[@name='birthday_month']")));
		s1.selectByIndex(2); //Replace month
		Select s2=new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		s2.selectByVisibleText("1992"); //Replace year
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click(); //Replace gender
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
}
