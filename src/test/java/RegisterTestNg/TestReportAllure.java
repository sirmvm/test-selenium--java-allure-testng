package RegisterTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import base.BaseAllure;
import io.qameta.allure.*;


public class TestReportAllure extends BaseAllure{
	//By loginLocator = By.linkText("Iniciar sesión");
    By loginCondicion = By.tagName("h2");
    By emailLocator = By.id("user[email]");
    By passwordLocator = By.id("user[password]");
    By loginCheckBox = By.id("user[remember_me]");
    By loginBtnLocator = By.xpath("//*[@type='submit']");
	static WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		BaseAllure baseAllure = new BaseAllure();
		baseAllure.initialize();
		driver = getDriver();
		driver.get("https://www.happyfamily.cl/pages/Academia");
		
		
	}
	
	@Test
	@Description("Validando que la página contenga lo solicitado")
	@Feature("Validado H2")
	public void validateTitle() {
		WebElement titleHappy = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/article/div[1]/header/h2"));
		Assert.assertTrue(isElementandTextPresente(titleHappy,"¿Quiénes somosss?"));
		
	}
	private boolean isElementandTextPresente(WebElement element, String value) {
		return element.isDisplayed() && element.getText().equalsIgnoreCase(value);
	}
	@Step("{0}")
	public String logReporter(String message) {
		return message;
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
