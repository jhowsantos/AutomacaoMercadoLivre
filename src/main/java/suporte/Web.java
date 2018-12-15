package suporte;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	public static WebDriver abrirNavegador(){
		
		//abrindo navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jhow\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		
		//navegando para a página https://www.google.com.br/
		navegador.get("https://www.google.com.br/");
		
		return navegador;
	}
}
