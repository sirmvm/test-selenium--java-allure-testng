package RegisterTestNg;

import base.LoginPage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;


public class LoginTestDiferentBrowser {

    private WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    @Parameters({"URL","BrowserType"})
    public void setUp(String url, String browserType) throws Exception {
        
        
    	
    	if(browserType.equalsIgnoreCase("Chrome")){
    		loginPage = new LoginPage(driver);
            driver = loginPage.chromeDriverConnection();
                		
    	}else if(browserType.equalsIgnoreCase("Firefox")) {
    		 		
    		loginPage = new LoginPage(driver);
            driver = loginPage.firefoxDriverConnection();
    		
    	}else if (browserType.equalsIgnoreCase("Edge")) {
    		loginPage = new LoginPage(driver);
            driver = loginPage.edgeDriverConnection();
    	}
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	System.out.println("Abriendo... = "+browserType);

    }
    
    @Test
    public void loginUser() throws InterruptedException {
        loginPage.signUser();

    }

    @AfterClass
    public void tearDown() throws Exception {
        // driver.quit();
    }

   

}
