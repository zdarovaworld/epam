package homework6collectionlist.travelagency_v5.country.repo;

import homework6collectionlist.travelagency_v5.common.business.repo.BaseRepo;
import homework6collectionlist.travelagency_v5.country.domain.Country;
import homework6collectionlist.travelagency_v5.country.search.CountrySearchCondition;

public interface CountryRepo extends BaseRepo {

    void add(Country country);

    Country findById(long id);

    Country[] search(CountrySearchCondition searchCondition);

}
