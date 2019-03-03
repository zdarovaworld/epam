package homework6collectionlist.travelagency_v5.city.repo;

import homework6collectionlist.travelagency_v5.city.domain.City;
import homework6collectionlist.travelagency_v5.city.search.CitySearchCondition;
import homework6collectionlist.travelagency_v5.common.business.repo.BaseRepo;

public interface CityRepo extends BaseRepo {
    void add(City city);

    City findById(long id);

    City[] search(CitySearchCondition searchCondition);
}
