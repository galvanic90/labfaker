package com.udea.labfaker;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LabfakerApplicationTests {
	@Autowired
	DataController dataController;

	@Test
	void version() {
		assertEquals("VERSION IS 1.0.0", dataController.version());
	}

	@Test
	void lengthRandomNations(){
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void lengthRandomCurrencies(){
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void testRandomCurrenciesCodeFormat(){
		DataController dataController = new DataController();
		JsonNode response = dataController.getRandomCurrencies();
		for (int i = 0; i < 20; i++){
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}"));
		}
	}

	@Test
	void testRandomAirportFormat(){
		DataController dataController = new DataController();
		JsonNode response = dataController.getRandomAviation();
		for (int i = 0; i < 20; i++){
			JsonNode airport = response.get(i);
			String code = airport.get("airport").asText();
			assertTrue(code.matches("[A-Z]{4}"));
		}
	}

}
