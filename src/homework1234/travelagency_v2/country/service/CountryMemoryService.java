package homework1234.travelagency_v2.country.service;

import homework1234.travelagency_v2.city.City;
import homework1234.travelagency_v2.city.repo.CityMemoryRepo;
import homework1234.travelagency_v2.country.Country;
import homework1234.travelagency_v2.country.repo.CountryMemoryRepo;

public class CountryMemoryService {

    private CountryMemoryRepo countryRepo = new CountryMemoryRepo();
    private CityMemoryRepo cityRepo = new CityMemoryRepo();

    public void addCountry(Country country) {
        countryRepo.addCountry(country);

        if (country.getCities() != null) {
            for (City city : country.getCities()) {
                cityRepo.addCity(city);
            }
        }
    }

    public Country findCountryById(long id) {
        return countryRepo.findCountryById(id);
    }

    public void deleteCountry(Country country) {
        countryRepo.deleteCountry(country);
    }

    public void deleteCountry(Long id) {
        countryRepo.deleteCountry(id);
    }

    public void printCountries() {
        countryRepo.printCountries();
    }
}
