package homework6collectionlist.travelagency_v5.city.repo.impl;

import homework6collectionlist.travelagency_v5.city.domain.City;
import homework6collectionlist.travelagency_v5.city.repo.CityRepo;
import homework6collectionlist.travelagency_v5.city.search.CitySearchCondition;
import homework6collectionlist.travelagency_v5.common.solutions.utils.ArrayUtils;

import static homework5interface.travelagency_v4.storage.Storage.cities;

public class CityMemoryArrayRepo implements CityRepo {
    private static final City[] EMPTY_CITIES_ARR = new City[0];
    private int cityIndex = 0;

    @Override
    public void add(City city) {
        if (cityIndex == cities.length - 1) {
            City[] newArrCities = new City[cities.length * 2];
            System.arraycopy(cities, 0, newArrCities, 0, cities.length);
            cities = newArrCities;
        }
        cities[cityIndex] = city;
        cityIndex++;
    }

    @Override
    public City findById(long id) {
        Integer cityIndex = findCityIndexById(id);
        if (cityIndex != null) {
            return cities[cityIndex];
        }
        return null;
    }

    @Override
    public City[] search(CitySearchCondition searchCondition) {
        return EMPTY_CITIES_ARR;
    }

    @Override
    public void deleteById(long id) {
        Integer foundIndex = findCityIndexById(id);
        if (foundIndex != null) {
            deleteCityByIndex(foundIndex);
        }
    }

    @Override
    public void printAll() {
        for (City city : cities) {
            if (city != null) {
                System.out.println(city);
            }
        }
    }

    private void deleteCityByIndex(int index) {
        ArrayUtils.removeElement(cities, index);
        cityIndex--;
    }

    private Integer findCityIndexById(long cityId) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null && Long.valueOf(cityId).equals(cities[i].getId())) {
                return i;
            }
        }
        return null;
    }
}
