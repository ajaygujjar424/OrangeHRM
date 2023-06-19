package qualifications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qualifaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[.='Admin']")).click();
        //Skills
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[4]")).click();  
        driver.findElement(By.xpath("//a[.='Skills']")).click();  
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Api");
        driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("manual sql");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Education
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[4]")).click();  
        driver.findElement(By.xpath("//a[.='Education']")).click(); 
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("BE");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Licenses
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[4]")).click();  
        driver.findElement(By.xpath("//a[.='Licenses']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("ISTQB");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Languages
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[4]")).click();  
        driver.findElement(By.xpath("//a[.='Languages']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Marathi");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Memberships 
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[4]")).click();  
        driver.findElement(By.xpath("(//a[@role='menuitem'])[5]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("NIT");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Nationalities
        driver.findElement(By.xpath("//a[.='Nationalities']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("India");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();
        
        
        
        
        
        
        
	}

}
