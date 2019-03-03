package homework6collectionlist.travelagency_v5.country.service;

import homework6collectionlist.travelagency_v5.city.repo.impl.CityMemoryArrayRepo;
import homework6collectionlist.travelagency_v5.common.business.application.StorageType;
import homework6collectionlist.travelagency_v5.country.repo.impl.CountryMemoryArrayRepo;
import homework6collectionlist.travelagency_v5.country.service.impl.CountryDefaultService;

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
