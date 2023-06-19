package req;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Req {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//span[.='Recruitment'])[1]")).click();
   //dropdown using robot class
      WebElement ele = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
       ele.click();
      Robot r =new Robot();
      Thread.sleep(2000);
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      //realse
      r.keyPress(KeyEvent.VK_ENTER);
      Thread.sleep(2000);
      r.keyRelease(KeyEvent.VK_ENTER);
      Thread.sleep(3000);
      
      WebElement ele3 = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]"));
      ele3.click();
     Robot ra =new Robot();
     Thread.sleep(2000);
     ra.keyPress(KeyEvent.VK_DOWN);
     ra.keyPress(KeyEvent.VK_DOWN);
     //realse
     ra.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(2000);
     ra.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(3000);
     
     WebElement ele1 = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[3]"));
     ele1.click();
    Robot re =new Robot();
    Thread.sleep(2000);
    re.keyPress(KeyEvent.VK_DOWN);
    re.keyPress(KeyEvent.VK_DOWN);
    re.keyPress(KeyEvent.VK_DOWN);
    re.keyRelease(KeyEvent.VK_DOWN);
   //realase
    re.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    re.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    // 
    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Tanu Gupta");
    driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("heroo");
    driver.findElement(By.xpath("//input[@placeholder='From']")).click();
    
    WebElement ele2 = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]"));
    ele2.click();
   Robot ro =new Robot(); 
   Thread.sleep(2000);
   ro.keyPress(KeyEvent.VK_DOWN);
   ro.keyPress(KeyEvent.VK_DOWN);
   ro.keyPress(KeyEvent.VK_DOWN);
   ro.keyRelease(KeyEvent.VK_DOWN);
   
   ro.keyPress(KeyEvent.VK_ENTER);
   Thread.sleep(2000);
   ro.keyRelease(KeyEvent.VK_ENTER);
   Thread.sleep(2000);
   
   WebElement ele4 = driver.findElement(By.xpath(" (//div[@class='oxd-select-text--after'])[5]"));
   ele4.click();
  Robot roq =new Robot(); 
  Thread.sleep(2000);
  roq.keyPress(KeyEvent.VK_DOWN);
  roq.keyPress(KeyEvent.VK_DOWN);
  roq.keyPress(KeyEvent.VK_ENTER);
  Thread.sleep(2000);
  roq.keyRelease(KeyEvent.VK_ENTER);
  Thread.sleep(2000);
  
   
   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("2022-06-06");
   driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("2023-06-06");
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   Thread.sleep(5000);
   driver.quit();
   
	}
	

}
