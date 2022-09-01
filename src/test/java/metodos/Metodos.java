package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	

	public void abrirNavegador() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}
	
	public void preencher(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
		
		}

	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}
	
	public void encerrarNavegador() {
		
		driver.quit();
		
	}
	
	
}
