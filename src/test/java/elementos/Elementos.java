package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By campoUsername = By.xpath("//input[@id='user-name']");
	
	public By campoPassword = By.xpath("//input[@id='password']");
	
	public By btnLogin = By.xpath("//input[@id='login-button']");
	
	public By btnAddToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");

	public By btnCarrinho = By.xpath("//div[@id='shopping_cart_container']");
	
	public By btnCheckout = By.xpath("//button[@id='checkout']");
	
	public By campoFirstName = By.xpath("//input[@id='first-name']");
	
	public By campoLastName = By.xpath("//input[@id='last-name']");
	
	public By campoPostalCode = By.xpath("//input[@id='postal-code']");
	
	public By btnContinue = By.xpath("//input[@id='continue']");
	
	public By btnFinish = By.xpath("//button[@id='finish']");
	
	public By messageValidate = By.xpath("//div[@id='checkout_complete_container']//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	
	
}
