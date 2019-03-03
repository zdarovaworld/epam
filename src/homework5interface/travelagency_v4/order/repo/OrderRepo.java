package homework5interface.travelagency_v4.order.repo;

import homework5interface.travelagency_v4.common.business.repo.BaseRepo;
import homework5interface.travelagency_v4.order.Order;
import homework5interface.travelagency_v4.order.search.OrderSearchCondition;

public interface OrderRepo extends BaseRepo {
    void add(Order order);

    Order findById(long id);

    Order[] search(OrderSearchCondition searchCondition);
}
