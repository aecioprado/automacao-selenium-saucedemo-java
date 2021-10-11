package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class BaseTests {

	protected static WebDriver driver;
	

	@BeforeAll
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@AfterAll
	public static void finalizar() {
		driver.quit();
	}

}
