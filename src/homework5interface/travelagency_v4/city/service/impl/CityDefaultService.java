package homework5interface.travelagency_v4.city.service.impl;

import homework5interface.travelagency_v4.city.domain.City;
import homework5interface.travelagency_v4.city.repo.CityRepo;
import homework5interface.travelagency_v4.city.service.CityService;

public class CityDefaultService implements CityService {
    private final CityRepo cityRepo;

    public CityDefaultService(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }

    @Override
    public void add(City city) {
        if (city != null) {
            cityRepo.add(city);
        }
    }

    @Override
    public City findById(Long id) {
        if (id != null) {
            return cityRepo.findById(id);
        } else {
            return null;
        }
    }

    @Override
    public void delete(City city) {
        if (city.getId() != null) {
            this.deleteById(city.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            cityRepo.deleteById(id);
        }
    }

    @Override
    public void printAll() {
        cityRepo.printAll();
    }
}
