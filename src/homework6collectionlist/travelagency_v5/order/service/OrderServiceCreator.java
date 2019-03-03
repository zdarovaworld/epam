package homework6collectionlist.travelagency_v5.order.service;

import homework6collectionlist.travelagency_v5.common.business.application.StorageType;
import homework6collectionlist.travelagency_v5.order.repo.impl.OrderMemoryArrayRepo;
import homework6collectionlist.travelagency_v5.order.service.impl.OrderDefaultService;

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
