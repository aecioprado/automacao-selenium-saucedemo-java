package tests;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTests extends BaseTests {
	
	
	@Test
	protected void testFazerLoginComSucesso_deveAbrirHomePage() {
		//Pré-requisitos
		LoginPage loginPage = new LoginPage(driver);
		carregarPaginaInicial();
		loginPage.preencherUsuario("standard_user");
		loginPage.preencherSenha("secret_sauce");
		loginPage.clicarBotaoLogin();
		
}
	
	
}
 