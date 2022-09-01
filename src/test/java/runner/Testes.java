package runner;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class Testes {

	Elementos el = new Elementos();
	Metodos metodos = new Metodos();

	@Before
	public void setUp() throws Exception {

		System.out.println("Abrindo o navegador");
		
		metodos.abrirNavegador();

	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Encerrando o navegador");
		
		metodos.encerrarNavegador();

	}

	@Test
	public void test() throws InterruptedException {

		System.out.println("Iniciando...");
		
		metodos.preencher("standard_user", el.campoUsername);
		metodos.preencher("secret_sauce", el.campoPassword);
		metodos.clicar(el.btnLogin);
		Thread.sleep(3000);
		metodos.clicar(el.btnAddToCart);
		metodos.clicar(el.btnCarrinho);
		metodos.clicar(el.btnCheckout);
		metodos.preencher("Virgulino", el.campoFirstName);
		metodos.preencher("Ferreira da Silva", el.campoLastName);
		metodos.preencher("10005", el.campoPostalCode);
		metodos.clicar(el.btnContinue);
		metodos.clicar(el.btnFinish);
		assertTrue("THANK YOU FOR YOUR ORDER", true);

	}

}
