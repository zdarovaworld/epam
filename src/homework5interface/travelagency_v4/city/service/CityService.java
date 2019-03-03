package homework5interface.travelagency_v4.city.service;

import homework5interface.travelagency_v4.city.domain.City;
import homework5interface.travelagency_v4.common.business.service.BaseService;

public interface CityService extends BaseService {
    void add(City city);

    City findById(Long id);

    void delete(City city);
}
