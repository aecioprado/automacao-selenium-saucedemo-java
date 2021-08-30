package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebDriver driver;

	private static By campoUsuario = By.id("user-name");
	private static By campoSenha = By.id("password");
	private static By botaoLogin = By.id("login-button");

	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
	}

	public void preencherUsuario(String usuario) {

		driver.findElement(campoUsuario).sendKeys(usuario);
	}

	public void preencherSenha(String senha) {

		driver.findElement(campoSenha).sendKeys(senha);
	}

	public HomePage clicarBotaoLogin() {
		
		driver.findElement(botaoLogin).click();
		
		return new HomePage(driver);
	}
	
	public HomePage fazerLogin() {
		preencherUsuario("standard_user");
		preencherSenha("secret_sauce");
		clicarBotaoLogin();
		
		return new HomePage(driver);
	}

}