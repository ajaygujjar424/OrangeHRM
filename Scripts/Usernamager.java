package usermanager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usernamager {

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
        
        //Usernamager
        driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click(); 
        WebElement button1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")); 
        button1.click();
        
        
       WebDriverWait wait2 = new WebDriverWait(driver, 30);
       wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//(//input[@class='oxd-input oxd-input--active'])[2]")));           

       Select user_role_dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")));
       user_role_dropdown.selectByVisibleText("Admin");
    /*    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("ajay");
       // driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
       // driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Admin']"));
        WebElement ele = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]]"));
        ele.click();
       Robot r =new Robot();
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       r.keyRelease(KeyEvent.VK_ENTER);
       driver.findElement(By.xpath("//button[@type='submit']")).click();*/
       

	}

}
