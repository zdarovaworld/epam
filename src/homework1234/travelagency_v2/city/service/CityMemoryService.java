package homework1234.travelagency_v2.city.service;

import homework1234.travelagency_v2.city.City;
import homework1234.travelagency_v2.city.repo.CityMemoryRepo;

public class CityMemoryService {

    private CityMemoryRepo cityRepo = new CityMemoryRepo();

    public void addCity(City city) {
        cityRepo.addCity(city);
    }

    public City findCityById(long id) {
        return cityRepo.findCityById(id);
    }

    public void deleteCity(City city) {
        cityRepo.deleteCity(city);
    }

    public void deleteCity(Long id) {
        cityRepo.deleteCity(id);
    }

    public void printCities() {
        cityRepo.printCities();
    }
}
