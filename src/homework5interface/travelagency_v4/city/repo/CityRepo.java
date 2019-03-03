package homework5interface.travelagency_v4.city.repo;

import homework5interface.travelagency_v4.city.domain.City;
import homework5interface.travelagency_v4.city.search.CitySearchCondition;
import homework5interface.travelagency_v4.common.business.repo.BaseRepo;

public interface CityRepo extends BaseRepo {
    void add(City city);

    City findById(long id);

    City[] search(CitySearchCondition searchCondition);
}
