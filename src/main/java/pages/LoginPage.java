package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private static WebDriver driver;

	private By campoUsuario = By.id("user-name");
	private By campoSenha = By.id("password");
	private By botaoLogin = By.id("login-button");
	private By mensagemErroAcessoSemLogin = By.xpath("//form/div[3]/h3");

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

	public void carregarPaginaInventory() {
		driver.get("https://www.saucedemo.com/inventory.html");

	}
	
	public String carregarMensagemErroAcessoSemLogin() {
		
		return driver.findElement(mensagemErroAcessoSemLogin).getText();
				
	}


}