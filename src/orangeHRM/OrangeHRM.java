package orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
  @BeforeTest//Login
  public void Login() {
	  System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"OrangeHRM");
	  
	  
	  
	  
	  
  }
  @Test(priority = 1)
  public void testLogindata() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      
}
  
  
  
  
  
  
  @Test(priority = 2)//CoroperateBranding
	  public void Admin() throws InterruptedException, AWTException 
  {
	  driver.findElement(By.xpath("//span[.='Admin']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[.='Corporate Branding']")).click(); 
	 WebElement cl = driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[1]"));
	 cl.click();
	  Thread.sleep(3000);
	  //Robot Class 
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
   
      //release Contol+V for pasting
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
  }
  
  
  
  
  
  
  
  @Test(priority = 3)//JOB
      public void Job() throws InterruptedException {
	  driver.findElement(By.xpath("//span[.='Admin']")).click();
        //job title
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Job ']")).click(); //job
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Job Titles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Automation");
        driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("3+ years of exprince in seleium"); 
        driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();//
        driver.findElement(By.xpath("//textarea[@placeholder='Add note']") ).sendKeys("basic of corejava");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']") ).click();
        Thread.sleep(2000);
        
        
        
        //pay grades
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Job ']")).click();
        driver.findElement(By.xpath("//a[.='Pay Grades']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Grade7");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        
        
        //Employestatus
        driver.findElement(By.xpath("//span[.='Job ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Employment Status']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("full time");      
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
 
        
        //Job Categories
        driver.findElement(By.xpath("//span[.='Job ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Job Categories']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Cloud engg");      
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000); 
  }
  
  
  
  
  
  
  
  @Test(priority = 4)//Workshift
  public void Workshift() throws InterruptedException {
	  driver.findElement(By.xpath("//span[.='Admin']")).click();
      driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
      Thread.sleep(2000); 
      driver.findElement(By.xpath("//a[.='Work Shifts']")).click();  
      driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Night shift");
      driver.findElement(By.xpath("(//i[@class='oxd-icon bi-clock oxd-time-input--clock'])[1]")).click();
      driver.findElement(By.xpath("(//i[@role='none'])[1]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//i[@role='none'])[4]")).click();
      driver.findElement(By.name("pm")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("good Job");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(2000);
  }
  
  
  
  
  
  
  @Test(priority = 5)//Organization
  public void Generalinfo() throws InterruptedException, AWTException {
	  driver.findElement(By.xpath("//span[.='Admin']")).click();
      driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")).click();
      driver.findElement(By.xpath("//a[.='Locations']")).click();
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("ajay");
    //Thread.sleep(2000);
    //driver.findElement(By.xpath("(//input[contains(@class, 'oxd-input oxd-input--active')])[3]")).sendKeys("raichur");
      WebElement ele = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
      ele.click();
    //Robot Class
   Robot r =new Robot();
   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   r.keyPress(KeyEvent.VK_ENTER);
   Thread.sleep(2000);
   r.keyRelease(KeyEvent.VK_ENTER);
   driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  
  
  
  
  
  
  @Test(priority = 6)//Generainformation
  public void Generalinfon() throws InterruptedException, AWTException{
	  driver.findElement(By.xpath("//span[.='Admin']")).click();
      //General Information
      driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")).click();
      driver.findElement(By.xpath("//a[.='General Information']")).click();
      driver.findElement(By.xpath(" //span[@class='oxd-switch-input oxd-switch-input--active --label-left']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("CDDD");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("545");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("52215");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("52215");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("23235");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]")).sendKeys("");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]")).sendKeys("pwd quarters");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]")).sendKeys("h.no23");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[9]")).sendKeys("karnataka");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[11]")).sendKeys("56666");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("Workspace");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(2000);
      
      
      
      //Location
      driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")).click();

      driver.findElement(By.xpath("//a[.='Locations']")).click();
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("ajay");
    //Thread.sleep(2000);
    //driver.findElement(By.xpath("(//input[contains(@class, 'oxd-input oxd-input--active')])[3]")).sendKeys("raichur");
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
  
  
  
  
  
  @Test(priority = 7)//Performance
  public void Performance() throws InterruptedException {
	  
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
      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("2023-08-02");
      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys("2023-08-03");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[3]")).sendKeys("2023-08-04");
      driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
      Thread.sleep(2000);
  }
  
  
  
  
  
 
  @Test(priority = 8)  //PIM
  public void Pim() throws InterruptedException {
	
      driver.findElement(By.xpath("(//span[.='PIM'])[1]")).click();
      //add emp details
      driver.findElement(By.xpath("//a[.='Employee List']")).click();
      driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
      driver.findElement(By.name("firstName")).sendKeys("ajay");
      driver.findElement(By.name("lastName")).sendKeys("gujjar");
      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1234");
      Thread.sleep(2000);
      //add pic
      //driver.findElement(By.xpath("(//img[@alt=\"profile picture\"])[2]")).click();
      //WebElement ele = driver.findElement(By.xpath("(//img[@alt=\\\"profile picture\\\"])[2]"));
      //ele.sendKeys("C:\\ajay\\fb.jpeg");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(2000);
  }
  
  
  
  
  
  
  
  @Test(priority = 9)//Qualifaction
  public void Qualification() {
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
  }
  
  
  
  
  
  
  
  @Test(priority = 10)//Req
  public void Req() throws InterruptedException, AWTException {
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
	   Thread.sleep(2000);
  }
  
  
  
  
  
  
 
 /* @Test(priority = 11)//Usernamager
  public void Usermanager() {
	  driver.findElement(By.xpath("//span[.='Admin']")).click();
      driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click(); 
      WebElement button1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")); 
      button1.click();
      
      
     WebDriverWait wait2 = new WebDriverWait(driver, 30);
     wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//(//input[@class='oxd-input oxd-input--active'])[2]")));           

     Select user_role_dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")));
     user_role_dropdown.selectByVisibleText("Admin");
  
  }*/
  
  
  
  
  
  @AfterTest
	  public void Terminate() throws InterruptedException
	  {
	  Thread.sleep(3000);
		 driver.quit();
	  }
  }		  
