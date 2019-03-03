package homework6collectionlist.travelagency_v5.storage;

import homework6collectionlist.travelagency_v5.city.domain.City;
import homework6collectionlist.travelagency_v5.country.domain.Country;
import homework6collectionlist.travelagency_v5.order.Order;
import homework6collectionlist.travelagency_v5.user.domain.User;

public class Storage {
    private static final int CAPACITY = 3;
    public static Country[] countries = new Country[CAPACITY];
    public static City[] cities = new City[CAPACITY];
    public static Order[] orders = new Order[CAPACITY];
    public static User[] users = new User[CAPACITY];
}
