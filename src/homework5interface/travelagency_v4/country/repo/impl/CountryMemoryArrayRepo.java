package homework5interface.travelagency_v4.country.repo.impl;

import homework5interface.travelagency_v4.common.solutions.utils.ArrayUtils;
import homework5interface.travelagency_v4.country.domain.Country;
import homework5interface.travelagency_v4.country.repo.CountryRepo;
import homework5interface.travelagency_v4.country.search.CountrySearchCondition;

import static homework5interface.travelagency_v4.storage.Storage.countries;
import static homework5interface.travelagency_v4.common.solutions.utils.StringUtils.isNotBlank;

public class CountryMemoryArrayRepo implements CountryRepo {
    private static final Country[] EMPTY_COUNTRIES_ARR = new Country[0];
    private int countryIndex = 0;


    @Override
    public void add(Country country) {
        if (countryIndex == countries.length - 1) {
            Country[] newArrCountries = new Country[countries.length * 2];
            System.arraycopy(countries, 0, newArrCountries, 0, countries.length);
            countries = newArrCountries;
        }

        countries[countryIndex] = country;
        countryIndex++;
    }

    @Override
    public Country findById(long id) {
        Integer countryIndex = findCountryIndexById(id);
        if (countryIndex != null) {
            return countries[countryIndex];
        }
        return null;
    }

    @Override
    public Country[] search(CountrySearchCondition searchCondition) {
        if (searchCondition.getId() != null) {
            return new Country[]{findById(searchCondition.getId())};
        } else {
            boolean searchByName = isNotBlank(searchCondition.getName());

            boolean searchByLanguage = isNotBlank(searchCondition.getLanguage());

            Country[] result = new Country[countries.length];
            int resultIndex = 0;

            for (Country country : countries) {
                if (country != null) {
                    boolean found = true;

                    if (searchByName) {
                        found = searchCondition.getName().equals(country.getName());
                    }

                    if (found && searchByLanguage) {
                        found = searchCondition.getLanguage().equals(country.getLanguage());
                    }

                    if (found) {
                        result[resultIndex] = country;
                        resultIndex++;
                    }
                }
            }

            if (resultIndex > 0) {
                Country toReturn[] = new Country[resultIndex];
                System.arraycopy(result, 0, toReturn, 0, resultIndex);
                return toReturn;
            }
        }
        return EMPTY_COUNTRIES_ARR;
    }

    @Override
    public void deleteById(long id) {
        Integer countryIndex = findCountryIndexById(id);

        if (countryIndex != null) {
            deleteCountryByIndex(countryIndex);
        }
    }

    @Override
    public void printAll() {
        for (Country country : countries)
            if (country != null) {
                System.out.println(country);
            }
    }

    private void deleteCountryByIndex(int index) {
        ArrayUtils.removeElement(countries, index);
        countryIndex--;
    }

    private Integer findCountryIndexById(long countryId) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null && Long.valueOf(countryId).equals(countries[i].getId())) {
                return i;
            }
        }
        return null;
    }
}
