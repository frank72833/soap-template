package com.fns.soaptemplate.country;

import com.fns.soaptemplate.country.server.Country;
import com.fns.soaptemplate.country.server.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryService {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country c1 = new Country();
        c1.setName("Spain");
        c1.setCapital("Madrid");
        c1.setCurrency(Currency.EUR);
        c1.setPopulation(48000000);
        countries.put(c1.getName(), c1);

        Country c2 = new Country();
        c2.setName("UK");
        c2.setCapital("London");
        c2.setCurrency(Currency.GBP);
        c2.setPopulation(66000000);
        countries.put(c2.getName(), c2);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
