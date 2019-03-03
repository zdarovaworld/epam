package homework1234.travelagency_v1;

public class Order {
    private User user;
    private double price;
    private Country country;

    public Order(User user, double price, Country country) {
        this.user = user;
        this.price = price;
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Order {" +
                "user=" + user.getLastName() +
                ", price=" + price +
                ", country=" + country.getName() +
                ", city=" + country.getCity().getName() +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("Vasya", "Petrov", 4111, 888888);
        Country country1 = new Country("Russia", "Russian", new City("SPb", 6_000_000, false));
        Order order = new Order(user1, 50000, country1);

        System.out.println(order);
    }
}
