package homework1234.travelagency_v2.storage;

import homework1234.travelagency_v2.city.City;
import homework1234.travelagency_v2.country.Country;
import homework1234.travelagency_v2.order.Order;
import homework1234.travelagency_v2.user.User;

public class Storage {
    private static final int CAPACITY = 3;
    public static Country[] countries = new Country[CAPACITY];
    public static City[] cities = new City[CAPACITY];
    public static Order[] orders = new Order[CAPACITY];
    public static User[] users = new User[CAPACITY];
}
