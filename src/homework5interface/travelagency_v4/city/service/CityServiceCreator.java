package homework5interface.travelagency_v4.city.service;

import homework5interface.travelagency_v4.city.repo.impl.CityMemoryArrayRepo;
import homework5interface.travelagency_v4.city.service.impl.CityDefaultService;
import homework5interface.travelagency_v4.common.business.application.StorageType;

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
