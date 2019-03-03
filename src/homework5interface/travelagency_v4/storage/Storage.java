package homework5interface.travelagency_v4.storage;

import homework5interface.travelagency_v4.city.domain.City;
import homework5interface.travelagency_v4.country.domain.Country;
import homework5interface.travelagency_v4.order.Order;
import homework5interface.travelagency_v4.user.domain.User;

public class Storage {
    private static final int CAPACITY = 3;
    public static Country[] countries = new Country[CAPACITY];
    public static City[] cities = new City[CAPACITY];
    public static Order[] orders = new Order[CAPACITY];
    public static User[] users = new User[CAPACITY];
}
