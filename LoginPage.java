package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	@FindBy(id = "usernameField")
	 WebElement username; 
	 
	 @FindBy(id = "passwordField")
	 WebElement password;
	 
	 @FindBy(xpath = "//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")
	 WebElement LoginBtn;
	 
	 public LoginPage()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        driver=new ChromeDriver(options);
	        
	        driver.get("https://www.naukri.com/nlogin/login");
	        driver.manage().window().maximize();
	        
	        PageFactory.initElements(driver, this );
	 }
	        
	        public void launchApplication()
		    {
		    	driver.get("https://www.naukri.com/nlogin/login");
		    }

		    public void closeBrowser() {
				driver.close();
		    }
		    
		 
		     public void enterUserName(String un)
		     {
		    	 username.sendKeys(un);
		    	 
		     }
		     
		     public void enterPassword(String pwd)
		     {
		    	 password.sendKeys(pwd);
		     }
		     
		     public void clickButton()
		     {
		    	 LoginBtn.click();
		     }
	
}
