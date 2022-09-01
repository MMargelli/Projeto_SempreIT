package casosDeTeste;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CasoDeTeste02 {

	Response response = RestAssured.get("https://api.hgbrasil.com/weather/");

	@Test
	public void validandoDate() {

		System.out.println(response.asPrettyString());

		String date = response.getBody().path("results.forecast.date[0,1,2,3,4,5,6,7,8,9]", "campos date").toString();

		System.out.println(date);

	}

}
