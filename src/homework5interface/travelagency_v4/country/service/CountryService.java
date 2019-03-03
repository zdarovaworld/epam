package homework5interface.travelagency_v4.country.service;

import homework5interface.travelagency_v4.common.business.service.BaseService;
import homework5interface.travelagency_v4.country.domain.Country;
import homework5interface.travelagency_v4.country.search.CountrySearchCondition;

public interface CountryService extends BaseService {

    void add(Country country);

    Country findById(Long id);

    void delete(Country country);

    Country[] search(CountrySearchCondition searchCondition);

}
