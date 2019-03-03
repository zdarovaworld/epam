package homework5interface.travelagency_v4.order.service;

import homework5interface.travelagency_v4.common.business.service.BaseService;
import homework5interface.travelagency_v4.order.Order;

public interface OrderService extends BaseService {

    void add(Order order);

    Order findById(Long id);

    void delete(Order order);
}
