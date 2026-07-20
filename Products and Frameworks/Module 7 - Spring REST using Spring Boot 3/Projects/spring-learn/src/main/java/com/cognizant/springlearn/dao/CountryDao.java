package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    private static final List<Country> COUNTRY_LIST = new ArrayList<>();

    static {
        Country c1 = new Country();
        c1.setCode("IN");
        c1.setName("India");

        Country c2 = new Country();
        c2.setCode("US");
        c2.setName("United States");

        Country c3 = new Country();
        c3.setCode("DE");
        c3.setName("Germany");

        Country c4 = new Country();
        c4.setCode("JP");
        c4.setName("Japan");

        COUNTRY_LIST.add(c1);
        COUNTRY_LIST.add(c2);
        COUNTRY_LIST.add(c3);
        COUNTRY_LIST.add(c4);
    }

    public List<Country> getAllCountries() {
        return COUNTRY_LIST;
    }

    public Country getCountry(String code) throws CountryNotFoundException {
        return COUNTRY_LIST.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }

    public void addCountry(Country country) {
        COUNTRY_LIST.add(country);
    }
}