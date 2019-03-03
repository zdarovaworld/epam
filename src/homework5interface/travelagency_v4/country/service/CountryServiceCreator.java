package homework5interface.travelagency_v4.country.service;

import homework5interface.travelagency_v4.city.repo.impl.CityMemoryArrayRepo;
import homework5interface.travelagency_v4.common.business.application.StorageType;
import homework5interface.travelagency_v4.country.repo.impl.CountryMemoryArrayRepo;
import homework5interface.travelagency_v4.country.service.impl.CountryDefaultService;

public final class CountryServiceCreator {

    private CountryServiceCreator(){
    }

    public static CountryService getCountryService(StorageType storageType) {
        switch (storageType) {

            case MEMORY_ARRAY:
                return new CountryDefaultService(new CountryMemoryArrayRepo(), new CityMemoryArrayRepo());

            case MEMORY_COLLECTION:{
                return null;
            }

            default: {
                return null;
            }
        }
    }
}
