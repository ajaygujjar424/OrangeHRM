package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workshift {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        driver.findElement(By.xpath("//span[.='Admin']")).click();
	        
	        
	        driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
	        Thread.sleep(2000); 
	        driver.findElement(By.xpath("//a[.='Work Shifts']")).click();  
	        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("bsdiibvib");
	        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-clock oxd-time-input--clock'])[1]")).click();
	        driver.findElement(By.xpath("(//i[@role='none'])[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//i[@role='none'])[4]")).click();
	        driver.findElement(By.name("pm")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("kjbkjbkj");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(2000);
	        
	          driver.quit();
	        

	}

}
