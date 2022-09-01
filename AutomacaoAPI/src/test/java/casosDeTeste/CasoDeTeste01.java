package casosDeTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CasoDeTeste01 {

	Response response = RestAssured.get("https://api.hgbrasil.com/weather/");
	
	
	public String forecast(String path, String topico) {
		
		return response.getBody().path("results.forecast."+path+"["+topico+"]", "retornando max").toString();
		
		}
		
	@Test
		public void testeValidarForecast() {
			
			System.out.println(response.asPrettyString());
			
	String max = response.getBody().path("results.forecast.max[2]", "retornando max ").toString();
	String tempoLimpo = response.getBody().path("results.forecast.description[2]", "retornando tempo limpo").toString();
			
			assertEquals("30", max);
			assertEquals("Tempo limpo", tempoLimpo);
			
			System.out.println(max + tempoLimpo);
			
		}
	
	public void validandoStatusCode() {
		
		System.out.println("O Status code é: " + response.getStatusCode());
		assertEquals(200, response.getStatusCode());
		
		
	}

}


