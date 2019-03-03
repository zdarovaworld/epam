package homework6collectionlist.travelagency_v5.city.service;

import homework6collectionlist.travelagency_v5.city.repo.impl.CityMemoryArrayRepo;
import homework6collectionlist.travelagency_v5.city.service.impl.CityDefaultService;
import homework6collectionlist.travelagency_v5.common.business.application.StorageType;

public final class CityServiceCreator {

    private CityServiceCreator(){

    }

    public static CityService getCityService(StorageType storageType) {
        switch (storageType) {

            case MEMORY_ARRAY:
                return new CityDefaultService(new CityMemoryArrayRepo());

            case MEMORY_COLLECTION:{
                return null;
            }

            default: {
                return null;
            }
        }
    }
}
