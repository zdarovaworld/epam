package homework5interface.travelagency_v4.order.repo.impl;

import homework5interface.travelagency_v4.common.solutions.utils.ArrayUtils;
import homework5interface.travelagency_v4.order.Order;
import homework5interface.travelagency_v4.order.repo.OrderRepo;
import homework5interface.travelagency_v4.order.search.OrderSearchCondition;

import static homework5interface.travelagency_v4.storage.Storage.orders;

public class OrderMemoryArrayRepo implements OrderRepo {
    private static final Order[] EMPTY_ORDERS_ARR = new Order[0];
    private int orderIndex = 0;

    @Override
    public void add(Order order) {
        if (orderIndex == orders.length - 1) {
            Order[] newArrOrders = new Order[orders.length * 2];
            System.arraycopy(orders, 0, newArrOrders, 0, orders.length);
            orders = newArrOrders;
        }
        orders[orderIndex] = order;
        orderIndex++;
    }

    @Override
    public Order findById(long id) {
        Integer orderIndex = findOrderIndexById(id);
        if (orderIndex != null) {
            return orders[orderIndex];
        }
        return null;
    }

    @Override
    public Order[] search(OrderSearchCondition searchCondition) {
        return EMPTY_ORDERS_ARR;
    }

    @Override
    public void deleteById(long id) {
        Integer orderIndex = findOrderIndexById(id);

        if (orderIndex != null) {
            deleteOrderByIndex(orderIndex);
        }
    }

    @Override
    public void printAll() {
        for (Order order : orders) {
            if (order != null) {
                System.out.println(order);
            }
        }
    }

    private void deleteOrderByIndex(int index) {
        ArrayUtils.removeElement(orders, index);
        orderIndex--;
    }

    private Integer findOrderIndexById(long orderId) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null && Long.valueOf(orderId).equals(orders[i].getId())) {
                return i;
            }
        }
        return null;
    }
}
