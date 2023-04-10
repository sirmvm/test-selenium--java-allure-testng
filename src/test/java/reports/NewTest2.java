package reports;

import org.testng.annotations.Test;

import base.RegisterPage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;


public class NewTest2 {
	private WebDriver driver;
	
	RegisterPage registerPage2;
	
	
  @BeforeClass
  public void beforeClass() {
	  registerPage2 = new RegisterPage(driver);
      driver = registerPage2.chromeDriverConnection();
      registerPage2.visit("https://www.happyfamily.cl/pages/Academia");
  }
  
  @Test
  public void registro2() throws InterruptedException {
	  registerPage2.registerUser();
	  System.out.println("Registro de usuario 2 correcto ");
  }

 
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  

}
