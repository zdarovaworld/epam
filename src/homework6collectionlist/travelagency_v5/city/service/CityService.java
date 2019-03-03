package homework6collectionlist.travelagency_v5.city.service;

import homework6collectionlist.travelagency_v5.city.domain.City;
import homework6collectionlist.travelagency_v5.common.business.service.BaseService;

public interface CityService extends BaseService {
    void add(City city);

    City findById(Long id);

    void delete(City city);
}
