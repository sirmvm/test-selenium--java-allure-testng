package reports;

import org.testng.annotations.Test;

import base.RegisterPage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;


public class NewTest3 {
	private WebDriver driver;
	
	RegisterPage registerPage3;
	
  @BeforeClass
  public void beforeClass() {
	  registerPage3 = new RegisterPage(driver);
      driver = registerPage3.chromeDriverConnection();
      registerPage3.visit("https://www.happyfamily.cl/pages/Academia");
  }
  
  
  @Test
  public void registro3() throws InterruptedException {
	  registerPage3.registerUser();
	  System.out.println("Registro de usuario 3 correcto ");
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  

}

