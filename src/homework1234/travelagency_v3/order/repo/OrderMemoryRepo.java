package homework1234.travelagency_v3.order.repo;

import homework1234.travelagency_v3.common.ArrayUtils;
import homework1234.travelagency_v3.order.Order;

import static homework1234.travelagency_v3.storage.Storage.orders;

public class OrderMemoryRepo {

    private int orderIndex = 0;

    public void addOrder(Order order) {
        if (orderIndex == orders.length - 1) {
            Order[] newArrOrders = new Order[orders.length * 2];
            System.arraycopy(orders, 0, newArrOrders, 0, orders.length);
            orders = newArrOrders;
        }
        orders[orderIndex] = order;
        orderIndex++;
    }

    public Order findOrderById(long id) {
        Integer orderIndex = findOrderIndexById(id);
        if (orderIndex != null) {
            return orders[orderIndex];
        }
        return null;
    }

    public void deleteOrder(Order order) {
        Integer foundIndex = findOrderIndexByEntity(order);
        if (foundIndex != null) {
            deleteOrderByIndex(foundIndex);
        }
    }

    public void deleteOrder(Long id) {
        Integer orderIndex = findOrderIndexById(id);
        if (orderIndex != null) {
            deleteOrderByIndex(orderIndex);
        }
    }

    private void deleteOrderByIndex(int index) {
        ArrayUtils.removeElement(orders, index);
        orderIndex--;
    }

    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private Integer findOrderIndexByEntity(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].equals(order)) {
                return i;
            }
        }
        return null;
    }

    private Integer findOrderIndexById(Long orderId) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getId().equals(orderId)) {
                return i;
            }
        }
        return null;
    }
}
