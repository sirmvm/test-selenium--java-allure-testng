package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
    By loginLocator = By.linkText("Iniciar sesión");
    By registerLocator = By.linkText("Crear una nueva cuenta");
    By registerCondicion = By.tagName("h2");
    By emailLocator = By.id("user[email]");
    By firstNameLocator = By.id("user[first_name]");
    By lastNameLocator = By.id("user[last_name]");
    By passwordLocator = By.id("user[password]");

    By registerBtnLocator = By.xpath("//*[@type='submit']");

    // constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() throws InterruptedException {
        click(loginLocator);
        Thread.sleep(2000);
        click(registerLocator);
        if (isDisplayed(registerCondicion)) {
            type("sofia@gmail.com", emailLocator);
            type("alonso", firstNameLocator);
            type("Sepulveda", lastNameLocator);
            type("sofia12345", passwordLocator);
            Thread.sleep(3000);
            click(registerBtnLocator);

        } else {
            System.out.println("La pagina de registro no se encuentra disponible");
        }
    }
    public void registerUser2() throws InterruptedException {
        click(loginLocator);
        Thread.sleep(2000);
        click(registerLocator);
        if (isDisplayed(registerCondicion)) {
            type("marios@gmail.com", emailLocator);
            type("Marias", firstNameLocator);
            type("Sepulveda", lastNameLocator);
            type("Marios12345", passwordLocator);
            Thread.sleep(3000);
            click(registerBtnLocator);

        } else {
            System.out.println("La pagina de registro no se encuentra disponible");
        }
    }
    public void registerUser3() throws InterruptedException {
        click(loginLocator);
        Thread.sleep(2000);
        click(registerLocator);
        if (isDisplayed(registerCondicion)) {
            type("paulina@gmail.com", emailLocator);
            type("Hector", firstNameLocator);
            type("Sepulveda", lastNameLocator);
            type("Paulina12345", passwordLocator);
            Thread.sleep(3000);
            click(registerBtnLocator);

        } else {
            System.out.println("La pagina de registro no se encuentra disponible");
        }
    }

}

