package homework6collectionlist.travelagency_v5.country.service;

import homework6collectionlist.travelagency_v5.common.business.service.BaseService;
import homework6collectionlist.travelagency_v5.country.domain.Country;
import homework6collectionlist.travelagency_v5.country.search.CountrySearchCondition;

public interface CountryService extends BaseService {

    void add(Country country);

    Country findById(Long id);

    void delete(Country country);

    Country[] search(CountrySearchCondition searchCondition);

}
