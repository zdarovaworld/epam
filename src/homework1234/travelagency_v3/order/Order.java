package homework1234.travelagency_v3.order;

import homework1234.travelagency_v3.city.City;
import homework1234.travelagency_v3.country.Country;
import homework1234.travelagency_v3.user.User;

public class Order {
    private Long id;
    private Country country;
    private City city;
    private User user;
    private String description;
    private int price;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
