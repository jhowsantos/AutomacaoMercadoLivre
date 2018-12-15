package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import suporte.Web;

public class LocalizarProdutoTest {

	private WebDriver navegador;

	@Test
	public void testLocalizarProduto() {

		// Abrindo navegador e navegando até a página do mercado livre
		navegador = Web.abrirNavegador();

		navegador.findElement(By.className("gLFyf")).sendKeys("mercado livre");
		navegador.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

		navegador.findElement(By.xpath("//h3[contains(text(), 'Mercado Livre Brasil')]")).click();

		// realizando a pesquisa pelo produto xbox 360
		navegador.findElement(By.name("as_word")).sendKeys("xbox 360");
		navegador.findElement(By.xpath("//button[@class='nav-search-btn']")).click();
		
		//validando se encontrou o produto
		String textoMercadoLivre = navegador.findElement(By.xpath("//h1[@class='breadcrumb__title']")).getText();		
		assertEquals("xbox 360", textoMercadoLivre);
		
		navegador.quit();
	}

}
