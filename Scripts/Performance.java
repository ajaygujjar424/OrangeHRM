package performance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performance {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Performance
        driver.findElement(By.xpath("(//span[.='Performance'])[1]")).click();
        Thread.sleep(2000);
        //Manage Reviews
        driver.findElement(By.xpath("//span[.='Manage Reviews ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='menuitem'])[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Poojaambrish Biradark A");//valid name
        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys("John  Smith");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]")).sendKeys("06-01-2022");
        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]")).sendKeys("06-01-2023");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[3]")).sendKeys("06-02-2023");
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Thread.sleep(5000);
        
        driver.quit();
        
        
        

	}

}
