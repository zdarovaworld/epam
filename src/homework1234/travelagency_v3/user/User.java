package homework1234.travelagency_v3.user;

import homework1234.travelagency_v3.order.Order;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private Passport passport;
    private Order[] orders;

    public User() {
    }

    public User(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public User(String name, String lastName, Passport passport) {
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }

    public User(Long id, String name, String lastName, Passport passport) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passport=" + passport +
                '}';
    }

    public class Passport {
        private int serial;
        private int number;

        public Passport() {
        }

        public Passport(int serial, int number) {
            this.serial = serial;
            this.number = number;
        }

        public int getSerial() {
            return serial;
        }

        public void setSerial(int serial) {
            this.serial = serial;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "serial=" + serial +
                    ", number=" + number;
        }
    }
}
