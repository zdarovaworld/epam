package homework1234.travelagency_v3.city.repo;

import homework1234.travelagency_v3.city.City;
import homework1234.travelagency_v3.common.ArrayUtils;

import static homework1234.travelagency_v3.storage.Storage.cities;

public class CityMemoryRepo {

    private int cityIndex = 0;

    public void addCity(City city) {
        if (cityIndex == cities.length - 1) {
            City[] newArrCities = new City[cities.length * 2];
            System.arraycopy(cities, 0, newArrCities, 0, cities.length);
            cities = newArrCities;
        }
        cities[cityIndex] = city;
        cityIndex++;
    }

    public City findCityById(long id) {
        Integer cityIndex = findCityIndexById(id);
        if (cityIndex != null) {
            return cities[cityIndex];
        }
        return null;
    }

    public void deleteCity(City city) {
        Integer foundIndex = findCityIndexByEntity(city);
        if (foundIndex != null) {
            deleteCityByIndex(foundIndex);
        }
    }

    public void deleteCity(Long id) {
        Integer cityIndex = findCityIndexById(id);
        if (cityIndex != null) {
            deleteCityByIndex(cityIndex);
        }
    }

    private void deleteCityByIndex(int index) {
        ArrayUtils.removeElement(cities, index);
        cityIndex--;
    }

    public void printCities() {
        for (City city : cities) {
            System.out.println(city);
        }
    }

    private Integer findCityIndexByEntity(City city) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(city)) {
                return i;
            }
        }
        return null;
    }

    private Integer findCityIndexById(Long cityId) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getId().equals(cityId)) {
                return i;
            }
        }
        return null;
    }
}
