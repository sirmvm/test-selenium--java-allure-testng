package RegisterTestNg;

import org.testng.annotations.Test;

import base.LoginPage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    private WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.visit("https://www.happyfamily.cl/pages/Academia");

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
