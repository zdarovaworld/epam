package homework6collectionlist.travelagency_v5.order;

import homework6collectionlist.travelagency_v5.city.domain.City;
import homework6collectionlist.travelagency_v5.country.domain.Country;
import homework6collectionlist.travelagency_v5.user.domain.User;

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
