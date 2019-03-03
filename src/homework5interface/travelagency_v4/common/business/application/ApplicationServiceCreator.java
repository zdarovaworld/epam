package homework5interface.travelagency_v4.common.business.application;

import homework5interface.travelagency_v4.city.service.CityService;
import homework5interface.travelagency_v4.city.service.CityServiceCreator;
import homework5interface.travelagency_v4.country.service.CountryService;
import homework5interface.travelagency_v4.country.service.CountryServiceCreator;
import homework5interface.travelagency_v4.order.service.OrderService;
import homework5interface.travelagency_v4.order.service.OrderServiceCreator;
import homework5interface.travelagency_v4.user.service.UserService;
import homework5interface.travelagency_v4.user.service.UserServiceCreator;

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
