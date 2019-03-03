package homework6collectionlist.travelagency_v5.order.service;

import homework6collectionlist.travelagency_v5.common.business.service.BaseService;
import homework6collectionlist.travelagency_v5.order.Order;

public interface OrderService extends BaseService {

    void add(Order order);

    Order findById(Long id);

    void delete(Order order);
}
