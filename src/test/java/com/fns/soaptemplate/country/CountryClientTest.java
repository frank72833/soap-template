package com.fns.soaptemplate.country;

import com.fns.soaptemplate.country.client.CountryClient;
import com.fns.soaptemplate.country.client.gen.GetCountryResponse;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CountryClientTest {

    @Autowired
    CountryClient client;

    @Nested
    public class countryService {
        @Test
        public void whenCountrySpain_thenCapitalIsMadrid() {
            GetCountryResponse response = client.getCountry("Spain");
            assertEquals("Madrid", response.getCountry().getCapital());
        }

        @Test
        public void whenCountryUk_thenCapitalIsLondon() {
            GetCountryResponse response = client.getCountry("UK");
            assertEquals("London", response.getCountry().getCapital());
        }
    }
}