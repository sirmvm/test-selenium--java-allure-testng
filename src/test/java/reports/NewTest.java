package reports;

import org.testng.annotations.Test;

import base.RegisterPage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;


public class NewTest {
	private WebDriver driver;
	RegisterPage registerPage;

	
  @BeforeClass
  public void beforeClass() {
	  registerPage = new RegisterPage(driver);
      driver = registerPage.chromeDriverConnection();
      registerPage.visit("https://www.happyfamily.cl/pages/Academia");
  }
  
  @Test
  public void registro1() throws InterruptedException {
	  registerPage.registerUser();
	  System.out.println("Registro de usuario 1 correcto");
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  

}
