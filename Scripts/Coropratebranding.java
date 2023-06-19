package coropratebranding;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coropratebranding {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       driver.findElement(By.xpath("//span[.='Admin']")).click();
        
        //Corporate Branding
       driver.findElement(By.xpath("//a[.='Corporate Branding']")).click(); 
   driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[1]")).click();
   Thread.sleep(3000);
   /*  WebElement ele = driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[1]"));
      ele.sendKeys("C://Users//USER//Dropbox//Resume.doc");
    //  (//div[@class='oxd-file-input-div'])[1]
         
       // UPLOADING FILE USING AutoIT....
       
     //  WebElement browser = driver.findElement(By.xpath("//input[@id='pimCsvImport_csvFile']"));   //Browse button
  //     browser.click();                                
       System.out.println("1");
    
    
       Runtime.getRuntime().exec("C:\\ajay\\importData.csv");
       System.out.println("2");
       Thread.sleep(3000);
    
     WebElement upload = driver.findElement(By.id("btnSave"));            //Upload button
      upload.click();
      System.out.println("3");     
     
      System.out.println("File Uploaded Successfully");    */       // Confirmation message
      
      Robot rb = new Robot();
      
      // copying File path to Clipboard
      StringSelection str = new StringSelection("C:\\ajay\\importData.csv");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
   
       // press Contol+V for pasting
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
   
      // release Contol+V for pasting
      rb.keyRelease(KeyEvent.VK_CONTROL);
      rb.keyRelease(KeyEvent.VK_V);
   
      // for pressing and releasing Enter
      rb.keyPress(KeyEvent.VK_ENTER);
      rb.keyRelease(KeyEvent.VK_ENTER);
      System.out.println("fileupload");
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[2]")).click();
      Thread.sleep(3000);
 Robot rba = new Robot();
      
      // copying File path to Clipboard
      StringSelection strr = new StringSelection("C:\\ajay\\importData.csv");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strr, null);
   
       // press Contol+V for pasting
       rba.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
   
      // release Contol+V for pasting
      rba.keyRelease(KeyEvent.VK_CONTROL);
      rba.keyRelease(KeyEvent.VK_V);
   
      // for pressing and releasing Enter
      rba.keyPress(KeyEvent.VK_ENTER);
      rba.keyRelease(KeyEvent.VK_ENTER);
      System.out.println("fileupload1");
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[3]")).click();
      Thread.sleep(3000);
       Robot rbaa = new Robot();
      
      // copying File path to Clipboard
      StringSelection strrr = new StringSelection("C:\\ajay\\importData.csv");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strrr, null);
   
       // press Contol+V for pasting
       rbaa.keyPress(KeyEvent.VK_CONTROL);
       rbaa.keyPress(KeyEvent.VK_V);
   
      // release Contol+V for pasting
      rbaa.keyRelease(KeyEvent.VK_CONTROL);
      rbaa.keyRelease(KeyEvent.VK_V);
   
      // for pressing and releasing Enter
      rbaa.keyPress(KeyEvent.VK_ENTER);
      rbaa.keyRelease(KeyEvent.VK_ENTER);
      System.out.println("fileupload2");
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(5000);
      driver.quit();
      
     }
   
  }
             
