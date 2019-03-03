package homework5interface.travelagency_v4.country.repo;

import homework5interface.travelagency_v4.common.business.repo.BaseRepo;
import homework5interface.travelagency_v4.country.domain.Country;
import homework5interface.travelagency_v4.country.search.CountrySearchCondition;

public interface CountryRepo extends BaseRepo {

    void add(Country country);

    Country findById(long id);

    Country[] search(CountrySearchCondition searchCondition);

}
