package organization;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Drop {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[.='Admin']")).click();
        
        driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")).click();
        driver.findElement(By.xpath("//a[.='Locations']")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("ajay");
      //  Thread.sleep(2000);
      //   driver.findElement(By.xpath("(//input[contains(@class, 'oxd-input oxd-input--active')])[3]")).sendKeys("raichur");
      WebElement ele = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
      ele.click();
     Robot r =new Robot();
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     r.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(2000);
     r.keyRelease(KeyEvent.VK_ENTER);
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
      
        

	}

}
