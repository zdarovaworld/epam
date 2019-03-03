package homework5interface.travelagency_v4.country.service.impl;

import homework5interface.travelagency_v4.city.domain.City;
import homework5interface.travelagency_v4.city.repo.CityRepo;
import homework5interface.travelagency_v4.country.domain.Country;
import homework5interface.travelagency_v4.country.repo.CountryRepo;
import homework5interface.travelagency_v4.country.search.CountrySearchCondition;
import homework5interface.travelagency_v4.country.service.CountryService;

public class CountryDefaultService implements CountryService {

    private final CountryRepo countryRepo;
    private final CityRepo cityRepo;

    public CountryDefaultService(CountryRepo markRepo, CityRepo modelRepo) {
        this.countryRepo = markRepo;
        this.cityRepo = modelRepo;
    }

    @Override
    public void add(Country country) {
        if (country != null) {
            countryRepo.add(country);

            if (country.getCities() != null) {
                for (City city : country.getCities()) {
                    if (city != null) {
                        cityRepo.add(city);
                    }
                }
            }
        }
    }

    @Override
    public Country findById(Long id) {
        if (id != null) {
            return countryRepo.findById(id);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Country country) {
        if (country.getId() != null) {
            this.deleteById(country.getId());
        }
    }

    @Override
    public Country[] search(CountrySearchCondition searchCondition) {
        return countryRepo.search(searchCondition);
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            countryRepo.deleteById(id);
        }
    }

    @Override
    public void printAll() {
        countryRepo.printAll();
    }
}
