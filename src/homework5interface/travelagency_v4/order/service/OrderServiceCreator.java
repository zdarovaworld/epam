package homework5interface.travelagency_v4.order.service;

import homework5interface.travelagency_v4.common.business.application.StorageType;
import homework5interface.travelagency_v4.order.repo.impl.OrderMemoryArrayRepo;
import homework5interface.travelagency_v4.order.service.impl.OrderDefaultService;

public final class OrderServiceCreator {

    private OrderServiceCreator(){

    }

    public static OrderService getOrderService(StorageType storageType) {
        switch (storageType) {

            case MEMORY_ARRAY:
                return new OrderDefaultService(new OrderMemoryArrayRepo());

            case MEMORY_COLLECTION:{
                return null;
            }

            default: {
                return null;
            }
        }
    }
}
