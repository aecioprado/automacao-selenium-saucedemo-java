package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	private By produtos = By.className("inventory_item_name");

	private By titulo = By.className("title");

	private By logout = By.xpath("//*[@id=\"logout_sidebar_link\"]");

	private By botaoMenu = By.id("react-burger-menu-btn");
	
	private By menuDropDownFiltro = By.cssSelector("select.product_sort_container");
	
	

	List<WebElement> listaProdutos = new ArrayList<>();

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public int contarProdutos() {
		carregarListaProdutos();
		return listaProdutos.size();

	}

	public void carregarListaProdutos() {
		listaProdutos = driver.findElements(produtos);
	}

	public String mostrarTitulo() {

		return driver.findElement(titulo).getText();

	}

	public void clicarBotaoMenu() {
		driver.findElement(botaoMenu).click();
	}

	public void clicarLinkLogOut() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(logout).click();

	}

	public String obterUrlPaginaLogin() {
		return driver.getCurrentUrl();
		
	}
	
	public void clicarMenuDropDown(String opcao) {
		driver.findElement(menuDropDownFiltro).sendKeys(opcao);
		
	}

}
