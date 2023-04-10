package RegisterTestNg;

import org.testng.annotations.Test;

import base.RegisterPage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

public class TestNG {
	private WebDriver driver;
	RegisterPage registerPage;
	
  @BeforeClass
  public void beforeClass() {
	  registerPage = new RegisterPage(driver);
      driver = registerPage.chromeDriverConnection();
      registerPage.visit("https://www.happyfamily.cl/pages/Academia");
  }
  
  @Test
  public void f() throws InterruptedException {
	  registerPage.registerUser();
  }
  

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

  

}
