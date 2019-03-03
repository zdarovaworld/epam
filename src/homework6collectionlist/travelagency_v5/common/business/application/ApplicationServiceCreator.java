package homework6collectionlist.travelagency_v5.common.business.application;

import homework6collectionlist.travelagency_v5.city.service.CityService;
import homework6collectionlist.travelagency_v5.city.service.CityServiceCreator;
import homework6collectionlist.travelagency_v5.country.service.CountryService;
import homework6collectionlist.travelagency_v5.country.service.CountryServiceCreator;
import homework6collectionlist.travelagency_v5.order.service.OrderService;
import homework6collectionlist.travelagency_v5.order.service.OrderServiceCreator;
import homework6collectionlist.travelagency_v5.user.service.UserService;
import homework6collectionlist.travelagency_v5.user.service.UserServiceCreator;

public final class ApplicationServiceCreator {

    private ApplicationServiceCreator() {

    }

    public static CountryService getCountryService(StorageType storageType) {
        return CountryServiceCreator.getCountryService(storageType);
    }

    public static CityService getCityService(StorageType storageType) {
        return CityServiceCreator.getCityService(storageType);
    }

    public static OrderService getOrderService(StorageType storageType) {
        return OrderServiceCreator.getOrderService(storageType);
    }

    public static UserService getUserService(StorageType storageType) {
        return UserServiceCreator.getUserService(storageType);
    }
}
