package com.udea.labfaker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DataController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String healthCheck() {
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body>\n" + "<H1>"+"HEALTH CHECK OK\n </H1>" + "</body>\n" + "</html>";
    }

    @GetMapping("/version")
    public String version() {
        return "VERSION IS 1.0.0";
    }

    @GetMapping("/nations")
    public JsonNode getRandomNations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var nations = objectMapper.createArrayNode();
        for (var i = 0; i < 10; i++) {
            var nation = faker.nation();
            nations.add(objectMapper.createObjectNode()
                    .put("nationality", nation.nationality())
                    .put("capitalCity", nation.capitalCity())
                    .put("bandera", nation.flag())
                    .put("language", nation.language())
            );
        }
        return nations;
    }

    @GetMapping("/currencies")
    public JsonNode getRandomCurrencies() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var currencies = objectMapper.createArrayNode();
        for (var i = 0; i < 20; i++) {
            var currency = faker.currency();
            currencies.add(objectMapper.createObjectNode()
                    .put("name", currency.name())
                    .put("code", currency.code())
            );
        }
        return currencies;
    }

    @GetMapping("/aviations")
    public JsonNode getRandomAviation() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var aviations = objectMapper.createArrayNode();
        for (var i = 0; i < 20; i++) {
            var aviation = faker.aviation();
            aviations.add(objectMapper.createObjectNode()
                    .put("aircraft", aviation.aircraft())
                    .put("airport", aviation.airport())
                    .put("METAR", aviation.METAR())
            );
        }
        return aviations;
    }

}