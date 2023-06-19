package pim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //PIM
        driver.findElement(By.xpath("(//span[.='PIM'])[1]")).click();
        //add emp details
        driver.findElement(By.xpath("//a[.='Employee List']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.name("firstName")).sendKeys("ajay");
        driver.findElement(By.name("lastName")).sendKeys("gujjar");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1234");
        Thread.sleep(2000);
        //add pic
      //  driver.findElement(By.xpath("(//img[@alt=\"profile picture\"])[2]")).click();
        //WebElement ele = driver.findElement(By.xpath("(//img[@alt=\\\"profile picture\\\"])[2]"));
       // ele.sendKeys("C:\\ajay\\fb.jpeg");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.quit();
        

	}

}
