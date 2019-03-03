package homework6collectionlist.travelagency_v5.order.repo;

import homework6collectionlist.travelagency_v5.common.business.repo.BaseRepo;
import homework6collectionlist.travelagency_v5.order.Order;
import homework6collectionlist.travelagency_v5.order.search.OrderSearchCondition;

public interface OrderRepo extends BaseRepo {
    void add(Order order);

    Order findById(long id);

    Order[] search(OrderSearchCondition searchCondition);
}
